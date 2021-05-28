package com.tasion.ribbon.controller;

import com.tasion.ribbon.entity.Hello;
import com.tasion.ribbon.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class UserRibbonController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.user-service}")
    private String userServiceUrl;
    @GetMapping("/hello")
    public Result<Hello> helloTest(){
        return restTemplate.getForObject(userServiceUrl+"/hello/test",Result.class);
    }
}
