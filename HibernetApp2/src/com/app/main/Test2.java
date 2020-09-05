package com.app.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Student3;

public class Test2 {

	public static void main(String[] args) throws Exception {

		Configuration cfgConfiguration = new Configuration();
		cfgConfiguration.configure("Hibernate.cfg.xml");
		SessionFactory sFactory = cfgConfiguration.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student3 s = new Student3();
		s.setStdId(1);
		s.setStdName("somesh");
//		List<String> list=new ArrayList<String>();
//		list.add("A");
//		list.add("B");
		
		s.getStdData().add("listA");
		s.getStdData().add("listB");
		s.getCustData().add("setA");
		s.getCustData().add("setB");
		s.getData().put(80, "mapA");
		s.getData().put(90, "mapB");
		
		session.save(s);
		transaction.commit();
		session.close();
		
		
		
		
	

	}

}
