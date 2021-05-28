package com.tasion.userserver.controller;

import com.tasion.userserver.entity.Hello;
import com.tasion.userserver.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${server.port}")
    private String serverport;
    @GetMapping("/test")
    public Result<Hello> helloTest(){
        Hello hello=new Hello();
        hello.setId("1");
        hello.setName("test");
        hello.setSex("其它:"+serverport);
        System.out.println("服务:"+serverport);
        return new Result<Hello>().success("查询成功",hello);
    }
}
