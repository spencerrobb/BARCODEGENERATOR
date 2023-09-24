package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product newProduct){
        return productService.save(newProduct);
    }

    @PostMapping("/buy")
    public Product buyProduct(@RequestParam String barid,@RequestParam int itemCount) throws Exception{
        return productService.buy(barid, itemCount);
    }

    @PostMapping("/addStock")
    public Product addStock(@RequestParam String barid,@RequestParam int itemCount) throws Exception{
        return productService.addStock(barid, itemCount);
    }

}
