package com.lyh.myjson.config;

import com.lyh.myjson.service.MyJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MyJsonService.class)
@EnableConfigurationProperties(MyJsonProperties.class)
public class MyJsonAutoConfiguration {
    private MyJsonProperties myJsonProperties;

    @Autowired
    public MyJsonAutoConfiguration(MyJsonProperties myJsonProperties){
        this.myJsonProperties = myJsonProperties;
    }


    @Bean
    @ConditionalOnMissingBean(MyJsonService.class)
    public MyJsonService myJsonService(){
        MyJsonService myJsonService = new MyJsonService();
        myJsonService.setName(myJsonProperties.getName());
        return myJsonService;
    }
}
