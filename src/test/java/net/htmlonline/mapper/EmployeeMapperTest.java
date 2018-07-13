package net.htmlonline.mapper;

import net.htmlonline.dao.Employee;
import net.htmlonline.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmployeeMapperTest {

    @Test
    public void test1() {
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee emp = mapper.getEmployeeById(1);
        System.out.println(emp);
    }
}
