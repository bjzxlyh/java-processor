package com.lyh.myjson.controller;

import com.lyh.myjson.pojo.User;
import com.lyh.myjson.service.MyJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJsonController {
    private MyJsonService myJsonService;

    @Autowired
    public MyJsonController(MyJsonService myJsonService){
        this.myJsonService = myJsonService;
    }

    @GetMapping("/user")
    public String getJsonStr(){
        User user = new User();
        user.setUserId(100);
        user.setUserName("Tom");
        user.setAge(60);

        return myJsonService.ObjectToJson(user);
    }

}
