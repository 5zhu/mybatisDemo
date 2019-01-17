package com.demo2.dao;

import com.demo.entity.User;

import java.util.List;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/13
 * @Description:
 */
public interface UserDao {

    public User findUserById(int id) throws Exception;

    public List<User> findUserByName(String name) throws Exception;

    public void insertUser(User user) throws Exception;

    public void deleteUser(int id) throws Exception;
}
