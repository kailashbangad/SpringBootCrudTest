package com.app.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Student;

public class TestStudent {

	public static void main(String[] args) throws Exception{
		
		Configuration cfgConfiguration=new Configuration();
		cfgConfiguration.configure("Hibernate.cfg.xml");
		SessionFactory sessionFactory=cfgConfiguration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		//Student student=new Student();
	//	session.get(Student.class,1);
		
		//Student student=session.get(Student.class, 1);
		Student student=(Student) session.load(Class.forName("com.app.model.Student"),1);
		
		student.setStudentId(1);
		student.setStudentName("kailash");
		student.setDt1(new Date());
		student.setDt2(new Date());
		student.setDt3(new Date());
		
		session.save(student);
		transaction.commit();
		
		System.out.println(student);
	
		session.close();
		
		
		
		
		
		
	}

}
