package com.app.dao;

import org.springframework.stereotype.Repository;

import com.app.model.Employee;
@Repository
public interface IEmployeeDao {

	
	public String insertEmployee(Employee emp);
	public String updateEmployee(Employee emp);
	
	public String deleteEmployee(int eid);
	public Employee searchEmployee(int eid);
	
	
	
}
