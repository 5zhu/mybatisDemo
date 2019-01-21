package com.demo2.mapper;

import com.demo.entity.User;
import com.demo3.CustomUser;
import com.demo3.UserCondition;

import java.util.List;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/13
 * @Description:
 */
public interface UserMapper {

    public User findUserById(int id) throws Exception;

    public int insertUserRetKey(User user) throws Exception;

    public List<CustomUser> findUserList(UserCondition userCondition) throws Exception;
}
