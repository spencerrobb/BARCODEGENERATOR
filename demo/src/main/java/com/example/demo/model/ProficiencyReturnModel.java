package com.example.demo.model;

import com.example.demo.enums.ProficiencyEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProficiencyReturnModel {

    private String key;
    private String dscp;

    public ProficiencyReturnModel(ProficiencyEnum enu){
        key = enu.getKey();
        dscp = enu.getDscp();
    }
}
