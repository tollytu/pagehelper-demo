package com.example.demo.dao;

import com.example.demo.demos.web.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 品牌(Brand)表数据库访问层
 *
 * @author zhangyuan
 * @since 2021-02-10 16:42:13
 */
@Mapper
public interface BrandDao {

    List<User> selectAll();
    

}

