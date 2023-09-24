package com.example.demo.services.ProductService;

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
}
