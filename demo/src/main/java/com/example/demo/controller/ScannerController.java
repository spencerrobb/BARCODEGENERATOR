package com.example.demo.controller;

import com.example.demo.services.ScanService.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scan")
public class ScannerController {

    @Autowired
    private ScanService scanService;

    @PostMapping("/scanProduct")
    public String scanProduct(@RequestParam String barid, @RequestParam String userid){
       return scanService.scanProduct(barid, userid);
    }
}
