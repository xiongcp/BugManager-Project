package com.xiongcp.bug.manager.service.impl;

import com.xiongcp.bug.manager.dao.UserMapper;
import com.xiongcp.bug.manager.entity.User;
import com.xiongcp.bug.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        Date date = new Date();
        return userMapper.selectAllUser(date);
    }

    @Override
    public User isLoginSuccess(User user) {
        return userMapper.findUserByEmailAndPassWord(user.getEmail(), user.getPswd());
    }

    @Override
    public int isUserExit(User user) {
        return userMapper.findUserExitByEmailAndPassWord(user.getEmail(), user.getPswd());
    }

    @Override
    public int updateLoginTime(Long userId, Date date) {
        return userMapper.updateLoginTime(userId, date);
    }
}
