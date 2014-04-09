package com.ming.emp.service;

import java.util.List;

import com.ming.emp.dao.EmployeeDao;
import com.ming.emp.pojo.Employee;

public class EmployeeServiceImp implements EmployeeService {

	private EmployeeDao employeeDao;
    
    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
     
       //服务层方法
    public void delete(Employee employ) {      
        this.employeeDao.removeEmployee(employ);
    }
     
    public List<Employee> findAll(Employee employ) {     
        return this.employeeDao.findAllEmployee(employ);
    }
       
    public Employee findById(Integer id) { 
        return this.employeeDao.findEmployeeById(id);
    }
     
    public void save(Employee employ) {
     this.employeeDao.saveEmployee(employ);
    }
     
    public void update(Employee employ) {      
     this.employeeDao.updateEmployee(employ);
    }

}
