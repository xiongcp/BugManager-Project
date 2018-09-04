package com.xiongcp.bug.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/9/3.
 */
@Controller
public class HtmlController {
    @RequestMapping(value = "/")
    public String toLogin(ModelMap modelMap) {
        modelMap.addAttribute("host", "http://www.baidu.com");
        return "login/login";
    }
}
