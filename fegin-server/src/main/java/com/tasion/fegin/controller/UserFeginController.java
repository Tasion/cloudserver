package com.tasion.fegin.controller;

import com.tasion.fegin.entity.Hello;
import com.tasion.fegin.entity.UmsAdmin;
import com.tasion.fegin.service.UserFeginService;
import com.tasion.fegin.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserFegin")
public class UserFeginController {
    @Autowired
    private UserFeginService userFeginService;

    @GetMapping("/selectByid")
    public Result<UmsAdmin> selectByid(String id) {
        return userFeginService.selectByid(id);
    }

    @GetMapping("/test")
    public Result<Hello> helloTest(){
        return userFeginService.helloTest();
    }
}
