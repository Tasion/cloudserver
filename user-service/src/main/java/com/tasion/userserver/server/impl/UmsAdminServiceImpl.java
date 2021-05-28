package com.tasion.userserver.server.impl;

import com.tasion.userserver.entity.UmsAdmin;
import com.tasion.userserver.mapper.UmsAdminMapper;
import com.tasion.userserver.server.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminMapper umsAdminMapper;


    public UmsAdmin selectByid(Long id) {
        return umsAdminMapper.selectByPrimaryKey(id);
    }

}
