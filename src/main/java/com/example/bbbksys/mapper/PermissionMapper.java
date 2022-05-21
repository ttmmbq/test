package com.example.bbbksys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bbbksys.pojo.Permission;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission> {
    List<Permission> findPermissionsByAdminId(Long adminId);
}
