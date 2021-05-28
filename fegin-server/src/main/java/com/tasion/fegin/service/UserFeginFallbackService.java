package com.tasion.fegin.service;

import com.tasion.fegin.entity.Hello;
import com.tasion.fegin.entity.UmsAdmin;
import com.tasion.fegin.util.Result;
import org.springframework.stereotype.Component;

@Component
public class UserFeginFallbackService implements UserFeginService {
    @Override
    public Result<UmsAdmin> selectByid(String id) {
        return new Result<UmsAdmin>().success("UmsAdmin查询,服务异常");
    }

    @Override
    public Result<Hello> helloTest() {
        return new Result<Hello>().success("Hello查询,服务异常");
    }
}
