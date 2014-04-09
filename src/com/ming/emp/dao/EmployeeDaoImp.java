package com.ming.emp.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ming.emp.pojo.Employee;

/**
 * A data access object (DAO) providing persistence and search support for
 * TEmployee entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ming.emp.pojo.TEmployee
 * @author MyEclipse Persistence Tools
 */

public class EmployeeDaoImp extends HibernateDaoSupport implements EmployeeDao{
	private static final Logger log = LoggerFactory
			.getLogger(EmployeeDaoImp.class);
	
	public List<Employee> findAllEmployee(Employee employee) {
        log.debug("finding All Employee");
        try {
            String hql="from Employee";
            String where =" where 1= 1 ";
            if(employee.getName()!=null&&!"".equals(employee.getName())){
                hql+=where+" and name like '%"+employee.getName()+"%' order by id desc";
            }
            System.out.println("hql语句:"+hql+" 记录条数:"+this.getHibernateTemplate().find(hql).size());
            return this.getHibernateTemplate().find(hql);
        } catch (RuntimeException re) {
            log.error("find failed", re);
            throw re;
        }
         
    }
         
    public List<Employee> findAllEmployee() {
        log.debug("finding TEmployee instance");
        try {
            String hql="from Employee";
            String where =" where 1= 1 ";
            System.out.println("hql语句:"+hql+" 记录条数:"+this.getHibernateTemplate().find(hql).size());
            return this.getHibernateTemplate().find(hql);
        } catch (RuntimeException re) {
            log.error("find failed", re);
            throw re;
        }
         
    }
    
    public void saveEmployee(Employee employee) {
        log.debug("saving new Employee with name=" + employee.getName());
        try {
            System.out.println("保存增加项 name=" + employee.getName());
            this.getHibernateTemplate().save(employee);
            System.out.println("增加完");
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
         
    }
  
    public void updateEmployee(Employee employee) {
        log.debug("updatting TEmployee instance");
        try {
            this.getHibernateTemplate().update(employee);
            log.debug("update successful");
        } catch (RuntimeException re) {
            log.error("update failed", re);
            throw re;
        }
         
    }
 
    public void removeEmployee(Employee employee) {
        log.debug("deleting TEmployee instance");
        try {
            this.getHibernateTemplate().delete(employee);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
         
    }
   
    public Employee findEmployeeById(Integer id) {
        log.debug("finding TEmployee with id=" + id);
        try {
            Employee employ=(Employee) this.getHibernateTemplate().get(Employee.class, id);
            return employ;
        } catch (RuntimeException re) {
            log.error("find failed", re);
            throw re;
        }
         
         
    }
}