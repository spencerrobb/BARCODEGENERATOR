package com.example.demo.controller;

import com.example.demo.entity.PurchaseHistory;
import com.example.demo.services.PurchaseService.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseHistoryController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/retrieveAllHistory")
    public List<PurchaseHistory> retrieveAllHistory(){
        return purchaseService.fetchHistory();
    }

    @GetMapping("/retrieveAllHistoryByBarid/{barid}")
    public List<PurchaseHistory> retrieveAllHistoryByBarid(@PathVariable String barid){
        return purchaseService.fetchHistoryByBarid(barid);
    }
}
