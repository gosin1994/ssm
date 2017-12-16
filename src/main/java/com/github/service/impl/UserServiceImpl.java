package com.github.service.impl;

import com.github.domain.User;
import com.github.mapper.UserMapper;
import com.github.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Gosin
 * @Date: 2017/12/16 17:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
        System.out.println(user.toString());
    }
}
