package com.lyh.myjson.service;

import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class MyJsonService {
    private String name;

    public String ObjectToJson (Object obj){
        return name + "@" + JSON.toJSONString(obj);
    }
}
