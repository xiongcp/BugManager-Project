package com.xiongcp.bug.manager.service;

import com.xiongcp.bug.manager.entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 */
public interface UserService {

    List<User> selectAllUser();

    /**
     * login
     * @param user from
     * @return user
     */
    User isLoginSuccess(User user);

    /**
     * login
     * @param user from
     * @return user
     */
    int isUserExit(User user);
    /**
     * 更新登陆时间
     * @param userId
     * @return
     */
    int updateLoginTime(Long userId, Date date);
}
