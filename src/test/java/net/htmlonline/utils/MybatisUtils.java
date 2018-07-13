package net.htmlonline.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        System.out.println("new line start");
        InputStream in;
        try {
            in = Resources.getResourceAsStream("mybatis-conf.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

}
