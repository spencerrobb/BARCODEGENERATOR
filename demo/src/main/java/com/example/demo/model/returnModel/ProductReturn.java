package com.example.demo.model.returnModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ProductReturn {

    Long id;
    String productName;
    String barid;
    String productDesc;
    String productMedicalName;
    int itemCount;
    double productPrice;
    double computePrice;
}
