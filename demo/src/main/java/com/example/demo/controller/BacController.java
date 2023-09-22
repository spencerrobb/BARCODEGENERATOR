package com.example.demo.controller;

import com.example.demo.services.BarbecueService.BarcecueBarcodeGenerator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class BacController {

    @Autowired
    private BarcecueBarcodeGenerator barcecueBarcodeGenerator;


    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping(value = "/barbecue/ean13/{barcode}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> barbecueEAN13Barcode(@PathVariable("barcode") String barcode) throws Exception {
        return ResponseEntity.ok(barcecueBarcodeGenerator.generateEAN13BarcodeImage(barcode));
    }
    //...
}
