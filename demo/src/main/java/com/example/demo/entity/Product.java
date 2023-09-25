package com.example.demo.entity;


import com.example.demo.model.requestModel.ProductRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Tbl_Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "Prod_Name")
    String productName;
    @Column(name="Bar_Id")
    String barid;
    @Column(name="Prod_Desc")
    String productDesc;
    @Column(name="Prod_Med_Name")
    String productMedicalName;
    @Column(name="Prod_Item_Count")
    int itemCount;
    @Column(name="Prod_Price")
    double productPrice;

    public Product(ProductRequest productRequest){
        if( productRequest.getId() != null){
            setId(productRequest.getId());
        }
        if( productRequest.getProductName() != null){
            setProductName(productRequest.getProductName());
        }
        if( productRequest.getBarid() != null){
            setBarid(productRequest.getBarid());
        }
        if( productRequest.getProductDesc() != null){
            setProductDesc(productRequest.getProductDesc());
        }
        if( productRequest.getProductMedicalName() != null){
            setProductMedicalName(productRequest.getProductMedicalName());
        }
        if( productRequest.getItemCount() != 0){
            setItemCount(productRequest.getItemCount());
        }
        if( productRequest.getProductPrice() != 0){
            setProductPrice(productRequest.getProductPrice());
        }
    }
}
