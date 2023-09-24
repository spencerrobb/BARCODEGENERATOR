package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Tbl_Barcode")
public class Barcode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    @Column(name = "Barcode_Desc")
    String charsNeeded;
    @Column(name = "Barcode_Type")
    String barcodeType;
    @Column(name = "Barcode_Library")
    String barcodeLibrary;
}
