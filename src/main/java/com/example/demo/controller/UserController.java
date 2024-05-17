package com.example.demo.controller;

import com.example.demo.demos.web.User;
import com.example.demo.dto.Query;
import com.example.demo.services.UserService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/getAll")
    public PageInfo<User> getAllUser(@RequestBody Query query){

        PageInfo<User> usersPageInfo = userService.findALL(query);

        return usersPageInfo;
    }

    @GetMapping("/getOne")
    public User findUserById(@Param("id") Long id){
        User user = userService.findById(id);
        return user;
    }
}
