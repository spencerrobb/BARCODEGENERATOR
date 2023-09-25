package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="tbl_Purchase_History")
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "Product_ID")
    String productId;
    @Column(name = "DateOfPurchase")
    Date date;
    @Column(name ="quantityPurchase")
    int quantityPurchase;
    @Column(name="updatedQuantity")
    int updatedCount;
    @Column(name="User_Id")
    String userId;
//    Product product;

    public PurchaseHistory(Product product){
        if(product.getBarid()!=null){
            setProductId(product.getBarid());
        }
    }
}
