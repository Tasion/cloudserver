package com.tasion.fegin.service;

import com.tasion.fegin.entity.Hello;
import com.tasion.fegin.entity.UmsAdmin;
import com.tasion.fegin.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = UserFeginFallbackService.class)
public interface UserFeginService {
    @GetMapping("/UmsAdmin/selectByid")
    Result<UmsAdmin> selectByid(@PathVariable String id);

    @GetMapping("/hello/test")
    Result<Hello> helloTest();
}