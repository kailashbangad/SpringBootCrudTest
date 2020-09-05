package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.EmployeeDaoImpl;
import com.app.model.Employee;

public class TestHibernateEmployeeApp {

	public static void main(String[] args) {
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			EmployeeDaoImpl daoImpl=context.getBean("empDao",EmployeeDaoImpl.class);
			Employee employee=new Employee();
			employee.setEname("kailash");
			employee.setEcity("jalna");
			employee.setEsal(2400);
			String status=daoImpl.insertEmployee(employee);
			System.out.println(status);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
