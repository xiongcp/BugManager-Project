package com.xiongcp.bug.manager.dao;


import com.xiongcp.bug.manager.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectAllUser(Date date);

    User findByName(String username);

    /**
     * use email and password to find user
     *
     * @param email    email
     * @param password password
     * @return user class
     */
    User findUserByEmailAndPassWord(@Param(value = "email") String email, @Param(value = "password") String password);

    /**
     * 更新用户登录时间
     *
     * @param userId user_id
     * @return 影响行数
     */
    int updateLoginTime(@Param(value = "userId") Long userId, @Param(value = "date") Date date);

    /**
     * use email and password to find user
     *
     * @param email    email
     * @param password password
     * @return user class
     */
    int findUserExitByEmailAndPassWord(@Param(value = "email") String email, @Param(value = "password") String password);

}