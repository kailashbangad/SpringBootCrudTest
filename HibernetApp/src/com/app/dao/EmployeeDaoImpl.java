package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Employee;


public class EmployeeDaoImpl implements IEmployeeDao {
	String status="";
	
	
	//hibernate template 
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional

	@Override
	public String insertEmployee(Employee emp) {
		Integer in=(Integer)hibernateTemplate.save(emp);
		if (in==emp.getEid()) {
			status="success";
			
			
			
		}else {
			status="fail";
		}
		
		return status;
	}
	@Transactional
	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional

	@Override
	public String deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public Employee searchEmployee(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

}
