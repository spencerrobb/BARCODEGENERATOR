package com.example.demo.services.Scan;

import com.example.demo.entity.ScannedProd;
import com.example.demo.entity.User;
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

    public String scanProduct(String barid, String userid) {

        int scanStatus = scanRepository.checkIfAlreadyScanned(barid,userid);
        if(scanStatus==0){
            ScannedProd newScannedProd = new ScannedProd();
            newScannedProd.setBarid(barid);
            newScannedProd.setUserid(userid);
            newScannedProd.setIsScanned(1);
            scanRepository.save(newScannedProd);

            User loggedInUser =userRepository.findByUserId(userid);
            double points = loggedInUser.getPointsEarned();
            points++;
            loggedInUser.setPointsEarned(points);
            userRepository.save(loggedInUser);

            return "A point has been added";
        } else {
            return "Already Scanned";
        }
    }
}
