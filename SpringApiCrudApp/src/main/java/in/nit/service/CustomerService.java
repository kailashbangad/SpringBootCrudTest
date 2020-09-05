package in.nit.service;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import in.nit.model.Customer;

public class CustomerService {
	private int custIdCount=1;
	private List<Customer> customerList=new CopyOnWriteArrayList<>();
	
	public Customer addCustomer(Customer customer) {
		customer.setCustId(custIdCount);
		customerList.add(customer);
		customerList.add(customer);
		custIdCount++;
		return customer;
	}
	
	public List<Customer>getCustomers(){
		return customerList;
	}


	public Customer getCustomer(int custId) {
		return customerList
				.stream()
				.filter(c->c.getCustId()==custId)
				.findFirst()
				.get();
		
	}
	public Customer upCustomer(int custId, Customer customer) {
		customerList
		.stream()
		.forEach(c->{
			
		});
		return customer;
	}
}
