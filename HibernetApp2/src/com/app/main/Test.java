package com.app.main;

import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Student2;

public class Test {

	public static void main(String[] args)throws Exception {

		try {
			// 1 create object of confguration file
			Configuration cfg = new Configuration();
			// 2 load configration file
			cfg.configure("Hibernate.cfg.xml");
			// 3 build session factory
			SessionFactory sf = cfg.buildSessionFactory();
			// 4 open session
			Session session = sf.openSession();
			// 5 begin tranction
			Transaction transaction = session.beginTransaction();
			// 6 create object of model class and assign the value
			Student2 student = new Student2();
			student.setSid(1);
			student.setSname("kailash");
			
			FileInputStream fis=new FileInputStream("G:\\photo\\imges\\IMG_4149.jpeg");
			byte[] arr1=new byte[fis.available()];
			fis.read(arr1);
			fis.close();
			student.setSimg(arr1);
			String string="Welcome to unify";
			char arr[]=string.toCharArray();
			
			student.setStxt(arr);
			
			
			
			
			
		
			// 7 save your data
			session.save(student);
		
		
			// 8commit your transaction
			transaction.commit();
			// 9 close your session
			
			Student2 student2=session.get(Student2.class, 1);
			System.out.println(student2);
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
