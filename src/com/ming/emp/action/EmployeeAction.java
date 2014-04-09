package com.ming.emp.action;

import java.util.List;

import com.ming.emp.pojo.Employee;
import com.ming.emp.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{

	private Employee employee;
    private List<Employee> list;
    private EmployeeService employeeService;
      
    public List<Employee> getList() {
           return list;
    }
        
    public void setList(List<Employee> list) {
           this.list = list;
    }
        
    public EmployeeService getEmployeeService() {
           return employeeService;
    }
        
    public void setEmployeeService(EmployeeService employeeService) {
           this.employeeService = employeeService;
    }
        
    public Employee getEmployee() {
           return employee;
    }
        
    public void setEmployee(Employee employee) {
           this.employee = employee;
    }
        
        
    //查询
    public String list(){
           list = this.employeeService.findAll(employee);
           //ServletActionContext.getRequest().setAttribute("list", list);
           System.out.println("list.size:"+list.size());
           return "list";
    }
        
    //增加
    public String add(){
           System.out.println("现在进入增加页面");
           return "add";
    }
          
    //增加保存
    public String addSave(){
//         int id=Integer.parseInt(UUID.randomUUID().toString());
//         employee.setId(id);
           this.employeeService.save(this.employee);
           System.out.println("现在保存增加的employee");
           return "relist";
    }
          
    //更改之前
    public String update(){
             employee=this.employeeService.findById(employee.getId());
             System.out.println("employee.id="+employee.getId());
             return "update";
    }
          
    //更改
    public String updateSave(){
               this.employeeService.update(employee);
           return "relist";
    }
          
    //删除
    public String delete(){
               this.employeeService.delete(employee);
           return "relist";
    }
}
