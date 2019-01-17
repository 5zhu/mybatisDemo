import com.demo.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/10
 * @Description:
 */
public class Test {

    @org.junit.Test
    public void findUserByIdTest() throws Exception{
        //1.读取配置文件
        String resource  = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.SqlSession 执行映射文件中定义的 SQL ，并返回映射结果
        User user = sqlSession.selectOne("findUserById",1);
        //打印输出结果
        //System.out.println(user.toString());

        List<User> list = sqlSession.selectList("findUserByName", "geguo");
        System.out.println(list.size());


        User u = new User();
        u.setUsername("tony");
        u.setGender(1);
        u.setAccount(10.0);
        u.setIdCard("12345");
        u.setPerset(false);
        u.setPassword("123456");
        int key = sqlSession.insert("insertUserRetKey", u);
        System.out.println(key);
        sqlSession.commit();
        //5.关闭 SqlSession
        sqlSession.close();
    }


}
