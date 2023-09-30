package com.example.demo.services.ProductService;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.entity.Product;
import com.example.demo.model.requestModel.PurchaseRequest;
import com.example.demo.repository.ProductRepository;
import com.example.demo.services.PurchaseService.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PurchaseService purchaseService;

    public Product registerProduct(Product newProduct) {

        Product newRegisteredProduct = null;

        Product checkIfExisting = productRepository.findByBarid(newProduct.getBarid());
        if (checkIfExisting!=null){
            return newRegisteredProduct=null;
        } else if(checkIfExisting==null){
            newRegisteredProduct = productRepository.save(newProduct);
        }
        return newRegisteredProduct;
    }

    public Product purchase(PurchaseRequest purchaseRequest)  throws Exception{

        Product product = productRepository.findByBarid(purchaseRequest.getBarid());
        int requestQuantityPurchase = purchaseRequest.getQuantityPurchase();
        int newCount = 0;
        int currentItemCount = product.getItemCount();
        if(currentItemCount <  requestQuantityPurchase){
            throw new Exception("Oops Out Of Stock");
        } else {
            newCount = currentItemCount - requestQuantityPurchase;
        }
        product.setItemCount(newCount);
        Product updatedProduct = product;
        purchaseService.saveTransactionDetails(updatedProduct, requestQuantityPurchase);

        return productRepository.save(updatedProduct);
    }

    public Product addStock(String barid, int itemCount) throws ProductNotFoundException, Exception {
        Product updatedProduct = null;
        try{
            Integer count  = productRepository.countByBarId(barid);
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
        } catch(Exception e){
            return updatedProduct;
        }
        return productRepository.save(updatedProduct);
    }

    public Product viewProduct(String barid) throws ProductNotFoundException, Exception{

        Product viewProduct = null;
        Integer count  = productRepository.countByBarId(barid);
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

    public Product checkProductByBardIdIfExists(String barid){
        return productRepository.findByBarid(barid);
    }

}
