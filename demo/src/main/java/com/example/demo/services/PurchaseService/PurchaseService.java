package com.example.demo.services.PurchaseService;

import com.example.demo.entity.Product;
import com.example.demo.entity.PurchaseHistory;
import com.example.demo.repository.PurchaseHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseHistoryRepository purchaseHistoryRepository;

    public void saveTransactionDetails(Product product, int quantityPurchase){
        PurchaseHistory newPurchaseHistory = new PurchaseHistory(product);
        newPurchaseHistory.setDate(new Date());
        newPurchaseHistory.setQuantityPurchase(quantityPurchase);
        newPurchaseHistory.setUpdatedCount(product.getItemCount());

        purchaseHistoryRepository.save(newPurchaseHistory);
    }

    public List<PurchaseHistory> fetchHistory(){
        return purchaseHistoryRepository.findAll();
    }

    public List<PurchaseHistory> fetchHistoryByBarid(String barid) {
        return purchaseHistoryRepository.fetchHistoryByBarId(barid);
    }
}
