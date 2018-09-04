package com.xiongcp.bug.manager.controller;

import com.xiongcp.bug.manager.entity.User;
import com.xiongcp.bug.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


/**
 * 登陆验证
 * Created by Administrator on 2018/8/29
 */
@RestController
public class LoginController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/getLogin", method = RequestMethod.POST)
    public ModelAndView login(ModelAndView modelAndView, @ModelAttribute(value = "user") User user, BindingResult bindingResult) {
        System.out.println(user.toString());
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getFieldError().getDefaultMessage());
            modelAndView.setViewName("login/login");
            return modelAndView;
        }
        if (user.getEmail() == null || user.getEmail().equals("")) {
            modelAndView.addObject("error", "邮箱必须填写");
            modelAndView.setViewName("login/login");
            return modelAndView;
        }
        if (user.getPswd() == null || user.getPswd().equals("")) {
            modelAndView.addObject("error", "密码必须填写");
            modelAndView.setViewName("login/login");
            return modelAndView;
        }
        User loginSuccess = userService.isLoginSuccess(user);
        if (loginSuccess != null) {
            //modelAndView.addObject("userName", loginSuccess.getEmail());
            modelAndView.setViewName("login/reset");
            userService.updateLoginTime(loginSuccess.getId(),new Date());
            return modelAndView;
        }
        modelAndView.addObject("error", "登陆失败");
        modelAndView.setViewName("login/login");
        return modelAndView;
    }
}
