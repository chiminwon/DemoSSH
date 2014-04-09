package com.ming.emp.service;

import java.util.List;

import com.ming.emp.pojo.Employee;

public interface EmployeeService {

	public void save(Employee employ);
    public void update(Employee employ);
    public void delete(Employee employ);
    public List<Employee> findAll(Employee employee);
    public Employee findById(Integer id);
}
