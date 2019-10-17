package com.asiainfo.mybatis_demo.service;

import com.asiainfo.mybatis_demo.entity.User;
import com.asiainfo.mybatis_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public List<User> findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}
