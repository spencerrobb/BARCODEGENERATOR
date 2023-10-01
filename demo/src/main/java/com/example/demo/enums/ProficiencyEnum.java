package com.example.demo.enums;

//import com.meteor.bob.model.KeyValueModelString;
//import com.meteor.bob.model.returns.ProficiencyReturnModel;
import com.example.demo.model.KeyValueModelString;
import com.example.demo.model.ProficiencyReturnModel;
import lombok.Getter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public enum ProficiencyEnum {

    BACKEND(" Backend","Backend"),
    REACT(" React","React"),
    MOBILEANDROID(" Android","Mobile-Android"),
    MOBILEIOS(" Ios","Mobile-IOS");

    private String key;
    private String dscp;

    private ProficiencyEnum(String key, String dscp) {
        this.key = key;
        this.dscp = dscp;
    }

    public static String getDscpFromKey(String key) {
        if (key != null) {
            for (ProficiencyEnum item : ProficiencyEnum.values()) {
                if (item.getKey().equals(key)) {
                    return item.getDscp();
                }
            }
        }
        return "";
    }

    public static List<String> getKeyList() {
        List<String> keyList = new ArrayList<>();
        for (ProficiencyEnum item : ProficiencyEnum.values()) {
            keyList.add(item.getKey());
        }
        return keyList;
    }

    public static List<ProficiencyReturnModel> getList() {
        return Arrays.asList(ProficiencyEnum.values()).stream().map(enu ->
                new ProficiencyReturnModel(enu)).collect(Collectors.toList());
    }

    public static List<KeyValueModelString> getKeyValueList() {
        List<KeyValueModelString> list = new ArrayList<>();
        for (ProficiencyEnum item: values()) {
            list.add(new KeyValueModelString(item.getKey(), item.getDscp()));
        }
        return list;
    }

}

