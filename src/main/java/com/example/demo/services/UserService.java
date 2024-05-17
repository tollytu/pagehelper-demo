package com.example.demo.services;

import com.example.demo.demos.web.User;
import com.example.demo.dto.Query;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    PageInfo<User> findALL(Query query);

    User findById(Long id);
}
