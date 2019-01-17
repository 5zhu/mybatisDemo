package com.demo2.dao;

import com.demo.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/13
 * @Description:
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("top.findUserById",id);
        //释放资源
        sqlSession.close();
        return user;
    }

    public List<User> findUserByName(String name) throws Exception {
        return null;
    }

    public void insertUser(User user) throws Exception {

    }

    public void deleteUser(int id) throws Exception {

    }
}
