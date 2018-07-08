package net.htmlonline.dao;

import net.htmlonline.bean.Employee;

public interface EmployeeInterfaceMapper {
    Employee getEmpById(Integer id);
    Employee getEmpById2(Integer id);
}
