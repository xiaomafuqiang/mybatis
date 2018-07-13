package net.htmlonline.mapper;

import net.htmlonline.dao.Employee;
import net.htmlonline.dao.Student;
import net.htmlonline.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmployeeMapperTest {
    private SqlSession session;

    @Test
    public void test1() {
        EmployeeMapper mapper = getMapper();
        Employee emp = mapper.getEmployeeById(1);
        System.out.println(emp);

        Student stu = mapper.getEmployeeByIdAndAge(4, 18);
        System.out.println("new emp::::::" + stu);

    }

    @Test
    public void testInsert() {
        EmployeeMapper mapper = getMapper();
        Student student = new Student(18, "fuqiang", "ma", "M");
        mapper.insertStudent(student);


        session.commit();
        session.close();

    }

    private EmployeeMapper getMapper() {
        session = MybatisUtils.getSession();
        return session.getMapper(EmployeeMapper.class);
    }
}
