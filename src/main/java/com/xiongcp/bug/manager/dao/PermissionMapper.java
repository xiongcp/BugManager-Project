package com.xiongcp.bug.manager.dao;


import com.xiongcp.bug.manager.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {
    List<Permission> findPermissionByUid(Long id);
}