package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.model.requestModel.PurchaseRequest;
import com.example.demo.services.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public Product registerProduct(@RequestBody Product newProduct){
        return productService.registerProduct(newProduct);
    }

//    @PostMapping("/buy")
//    public Product buyProduct(@RequestParam String barid, @RequestParam int itemCount) throws Exception{
//        return productService.buy(barid, itemCount);
//    }

    @PostMapping("/buy")
    public Product buyProduct(@RequestBody PurchaseRequest purchaseRequest) throws Exception{
        return productService.purchase(purchaseRequest);
    }

    @PostMapping("/addStock")
    public Product addStock(@RequestParam String barid, @RequestParam int itemCount) throws Exception{
        return productService.addStock(barid, itemCount);
    }

    @GetMapping("/viewProduct/{barid}")
    public Product getProduct(@PathVariable String barid) throws Exception {
        return productService.viewProduct(barid);
    }

    @GetMapping("/getListOfProducts")
    public List<Product> getAll() throws Exception {
        return productService.getAllProduct();
    }

}
