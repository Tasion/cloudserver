package com.tasion.userserver.server;

import com.tasion.userserver.entity.UmsAdmin;

public interface UmsAdminService {
    UmsAdmin selectByid(Long id);
}
