package com.tasion.userserver.controller;

import com.tasion.userserver.entity.UmsAdmin;
import com.tasion.userserver.server.UmsAdminService;
import com.tasion.userserver.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UmsAdmin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;
    @Value("${server.port}")
    private String serverport;


    @GetMapping("/selectByid")
    public Result<UmsAdmin> selectByid(@RequestParam String id) {
        UmsAdmin select = umsAdminService.selectByid(Long.valueOf(id));
        System.out.println("服务:"+serverport);
        return new Result<UmsAdmin>().success("返回结果",select);
    }
}
