package com.example.demo.model;


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

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setProductMedicalName(String productMedicalName) {
        this.productMedicalName = productMedicalName;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getBarid() {
        return barid;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public String getProductMedicalName() {
        return productMedicalName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getProductPrice() {
        return productPrice;
    }

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
}
