package com.example.demo.entity;

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
@Table(name="tbl_scan_products")
public class ScannedProd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "Bar_id")
    String barid;
    @Column(name = "User_id")
    String userid;
    @Column(name = "is_Scanned")
    int isScanned;

}
