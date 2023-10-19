package com.example.demo.services.ScanService;

import com.example.demo.entity.ScannedProd;
import com.example.demo.entity.User;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.ScanRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScanService {

    @Autowired
    private ScanRepository scanRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    public String scanProduct(String barid, long userid) {

        String response;
        String removeCheckSum =  removeLastCharacter(barid);
        int checkExistingProduct = productRepository.countByBarId(removeCheckSum);
        if(checkExistingProduct!=0){
            int scanStatus = scanRepository.checkIfAlreadyScanned(barid,userid);
            if(scanStatus==0){ //check if product is already scanned
                ScannedProd newScannedProd = new ScannedProd();
                newScannedProd.setBarid(barid);
                newScannedProd.setUserid(userid);
                newScannedProd.setIsScanned(1);
                scanRepository.save(newScannedProd);

                User loggedInUser = userRepository.findByUserId(userid);
                double points = loggedInUser.getPointsEarned();
                points++;
                loggedInUser.setPointsEarned(points);
                userRepository.save(loggedInUser);

                response =  "A point has been added to user: "+ userid;
            } else {
                response =  "Already Scanned";
            }
        } else {
            response = "Product is not registered in the inventory";
        }
        return response;
    }

    public static String removeLastCharacter(String str) {
        String result = null;
        if ((str != null) && (str.length() > 0)) {
            result = str.substring(0, str.length() - 1);
        }
        return result;
    }
}
