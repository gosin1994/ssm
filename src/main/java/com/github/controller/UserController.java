package com.github.controller;

import com.github.domain.User;
import com.github.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Gosin
 * @Date: 2017/12/16 16:34
 */
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 测试：增加用户
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add")
    public String addUser(User user) {
        System.out.println(user);
        userService.addUser(user);
        return "ok";
    }
}
