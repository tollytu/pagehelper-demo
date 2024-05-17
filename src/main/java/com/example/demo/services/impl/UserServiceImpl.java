package com.example.demo.services.impl;

import com.example.demo.dao.BrandDao;
import com.example.demo.dao.UserMapper;
import com.example.demo.demos.web.User;
import com.example.demo.dto.Query;
import com.example.demo.services.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public PageInfo<User> findALL(Query query) {

        PageHelper.startPage(query.getPage(), query.getSize(), query.getSort() + " "+ query.getOrder());

        List<User> users = userMapper.findAll();

        PageInfo<User> userPageInfo = new PageInfo<User>(users);
        return userPageInfo;
    }

    @Override
    public User findById(Long id) {
        User user = userMapper.findById(id);
        return user;
    }


}
