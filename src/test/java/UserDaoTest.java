import com.demo.entity.User;
import com.demo2.dao.UserDao;
import com.demo2.dao.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/13
 * @Description:
 */
public class UserDaoTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp(){
//1.读取配置文件
        String resource  = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.根据配置文件构建 SqlSessionFactory
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() throws Exception {
        // 创建UserDao的对象
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);

        // 调用UserDao的方法
        User user = userDao.findUserById(2);

        System.out.println(user);
    }
}
