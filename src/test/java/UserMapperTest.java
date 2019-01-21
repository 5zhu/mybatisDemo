import com.demo.entity.User;
import com.demo2.mapper.UserMapper;
import com.demo3.CustomUser;
import com.demo3.UserCondition;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/13
 * @Description:
 */
public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    //注解Before是在执行本类所有测试方法之前先调用这个方法
    @Before
    public void setup() throws Exception{
        //创建SqlSessionFactory
        String resource="mybatis-config.xml";

        //将配置文件加载成流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入mybatis配置文件的信息
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() throws Exception{

        SqlSession sqlSession=sqlSessionFactory.openSession();

        //创建UserMapper代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        //调用userMapper的方法
        User user=userMapper.findUserById(2);

        System.out.println(user);
    }

    @Test
    public void testInsertUser() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("gegf");
        user.setGender(1);
        user.setPassword("testtest");
        user.setPerset(true);
        user.setAccount(12.34);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.insertUserRetKey(user));
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testFindUserList() throws Exception{

        SqlSession sqlSession=sqlSessionFactory.openSession();

        //创建UserMapper代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        //调用userMapper的方法
        UserCondition uc = new UserCondition();
        User user = new User();
        user.setUsername("gegf");
        user.setGender(1);
        uc.setUser(user);

        List<CustomUser> list = userMapper.findUserList(uc);

        System.out.println(list);
    }
}
