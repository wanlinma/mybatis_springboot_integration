package com.asiainfo.mybatis_demo.controller;

import com.asiainfo.mybatis_demo.entity.User;
import com.asiainfo.mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("all")
    public ResponseEntity getAllUsers(){
        List<User> allUser = userService.findAllUser();
        return ResponseEntity.ok().body(allUser);
    }
    @GetMapping("one/{userId}")
    public ResponseEntity getUserById(@PathVariable("userId") Integer userId){
        List<User> user = userService.findUserById(userId);
        return ResponseEntity.ok().body(user);
    }
}
