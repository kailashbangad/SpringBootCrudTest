package in.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nit.dao.UserDao;
import in.nit.model.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		UserDao userDao=context.getBean("userDao",UserDao.class);
		User user=new User(101, "kailash", "2400", "male", "P1", "jalna", "HINDI", "12-12-2020", "IT");
		int r=userDao.insertUser(user);
		System.out.println("done"+r);
	}

}
