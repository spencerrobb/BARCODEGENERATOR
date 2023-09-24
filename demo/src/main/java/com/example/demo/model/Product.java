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
}
