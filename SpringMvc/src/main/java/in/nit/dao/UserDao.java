package in.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.nit.model.User;
@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate ht;
	@Transactional
	public int insertUser(User user)
	{	//it return number of row afftected 
		Integer id=(Integer)this.ht.save(user);
		return id;
		
	}
	public HibernateTemplate getHt() {
		return ht;
	}
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
