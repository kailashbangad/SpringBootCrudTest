package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class TestInsert {

	public static void main(String[] args) {
		try {
			// 1. create config obj
			Configuration cfg = new Configuration();
			// 2. load cfg.xml
			cfg.configure("Hibernate.cfg.xml");
			// 3. build ses fact
			SessionFactory sf = cfg.buildSessionFactory();
			// 4. open one session
			Session ses = sf.openSession();
			// 5. begin Tx
			Transaction tx = ses.beginTransaction();
			// 6. perform save operation
			Employee s = new Employee();
			s.setEid(2);
			s.setEname("payal");
			s.setEsal(45628);
			//ses.delete(s);
			//ses.update(s);
			ses.saveOrUpdate(s);
			//ses.save(s);
			// 7. commit
			tx.commit();
			// 8.close ses
			ses.close();
			System.out.println("done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
