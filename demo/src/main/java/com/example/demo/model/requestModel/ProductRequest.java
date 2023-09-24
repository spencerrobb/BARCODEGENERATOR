package com.example.demo.model.requestModel;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ProductRequest {

    Long id;
    String productName;
    String barid;
    String productDesc;
    String productMedicalName;
    int itemCount;
    double productPrice;


}
