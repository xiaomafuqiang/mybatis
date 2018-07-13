package net.htmlonline.mapper;

import net.htmlonline.dao.Employee;
import net.htmlonline.dao.Student;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    Employee getEmployeeById(@Param("id") Integer id);

    Student getEmployeeByIdAndAge(@Param("id") Integer id, @Param("age") Integer age);

    int insertStudent(Student student);
}
