package net.htmlonline.dao;

public interface EmployeeInterfaceMapper {
    Employee getEmpById(Integer id);
    Employee getEmpByIdAndGender(Integer id, String gender);
}
