package com.xiongcp.bug.manager.controller;

import com.xiongcp.bug.manager.entity.User;
import com.xiongcp.bug.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29.
 */
@RestController
@RequestMapping("user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<User> getAllUserList(){
        return userService.selectAllUser();
    }
}
