package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.customer.Customer;
import in.nit.model.product.Product;
import in.nit.repo.customer.CustomerRepository;
import in.nit.repo.product.ProductRepository;

@RestController
public class MultiDatabaseController {
	@Autowired(required=true)
	private ProductRepository repo1;
	@Autowired(required=true)
	private CustomerRepository repo2;
	@GetMapping("/allproduct")
	private List<Product> getProducts() {
		return repo1.findAll();
		
	}
	
	@GetMapping("/allcustomer")
	private List<Customer> getCustomers() {
		return repo2.findAll();
		
	}
	

}
