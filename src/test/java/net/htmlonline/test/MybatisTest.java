package net.htmlonline.test;

import net.htmlonline.dao.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    private SqlSessionFactory getSessionFactory() throws IOException {

        String resouce = "mybatis-conf.xml";
        InputStream in = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        return sqlSessionFactory;
    }

    /*
    * 普通写法， 老版本
    * */
    @Test
    public void test() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSessionFactory();

        SqlSession openSession = sqlSessionFactory.openSession();
        Employee employee = openSession.selectOne("EmployeeMapperTest.selectEmp", 1);

        System.out.println(employee);
        openSession.close();

    }


    /*
    * 接口写法， 新版本
    * */

}
