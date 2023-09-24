package com.example.demo.services.ProductService;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product newProduct) {
        return productRepository.save(newProduct);
    }

    public Product buy(String barid, int itemCount)  throws Exception{

        Product product = productRepository.findByBarid(barid);
        System.out.println(product.getBarid() + " BARID2");
        int newCount = 0;
        int currentItemCount = product.getItemCount();
        if(currentItemCount <  itemCount){
            throw new Exception();
        } else {
            newCount = currentItemCount - itemCount;
        }
        product.setItemCount(newCount);
        Product updatedProduct = product;

        return productRepository.save(updatedProduct);
    }

    public Product addStock(String barid, int itemCount) throws ProductNotFoundException,Exception {

        Product updatedProduct = null;
        Integer count  = productRepository.countById(barid);
        System.out.println(count + "EXISTS") ;
        if(count == 0){
            System.out.println("No Update Were Made");
            throw new ProductNotFoundException("Product Doesnt Exist!");
        } else {
            System.out.println("MAY LAMAN SYA");
            Product product = productRepository.findByBarid(barid);
            System.out.println(product.getBarid() + " BARID2");
            int currentItemCount = product.getItemCount();
            int newCount = currentItemCount + itemCount;
            product.setItemCount(newCount);
            updatedProduct = product;
        }
        return productRepository.save(updatedProduct);
    }

    public Product viewProduct(String barid) throws ProductNotFoundException ,Exception{

        Product viewProduct = null;
        Integer count  = productRepository.countById(barid);
        if(count == 0){
            throw new ProductNotFoundException("Product Doesnt Exist!");
        } else {
            viewProduct = productRepository.findByBarid(barid);
        }
        return viewProduct;
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void validate(Product product){

        //insert code here

    }
}
