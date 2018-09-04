package com.xiongcp.bug.manager.dao;


import com.xiongcp.bug.manager.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface RoleMapper {
    List<Role> findRoleByUid(Long id);
}