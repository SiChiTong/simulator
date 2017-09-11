package com.xxxtai.myToolKit;

import lombok.Getter;
import lombok.Setter;

public enum City {
    GUANGZHOU("广州", 510000L),
    SHENZHEN("深圳", 518000L),
    BEIJING("北京", 100000L),
    SHANGHAI("上海", 200000L),
    CHONGQING("重庆", 404100),
    TIANJIN("天津", 300000),
    NULL("城市不存在", 0);

    private @Setter @Getter
    String name;
    private @Setter @Getter
    long code;
    City(String name, long code){
        this.name = name;
        this.code = code;
    }

    public static City valueOfName(String name){
        for (City city : City.values()) {
            if (city.getName().equals(name)) {
                return city;
            }
        }
        return NULL;
    }
}
