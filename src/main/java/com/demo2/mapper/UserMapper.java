package com.demo2.mapper;

import com.demo.entity.User;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/13
 * @Description:
 */
public interface UserMapper {

    public User findUserById(int id) throws Exception;
}
