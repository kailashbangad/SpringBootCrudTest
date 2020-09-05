package in.nit.main;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.nit.model.customer.Customer;
import in.nit.model.product.Product;
import in.nit.repo.customer.CustomerRepository;
import in.nit.repo.product.ProductRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {in.nit.repo.customer.CustomerRepository.class,in.nit.repo.product.ProductRepository.class})
@EntityScan(basePackageClasses = {in.nit.model.customer.Customer.class,in.nit.model.product.Product.class})
@ComponentScan(basePackages = {"in.nit"})
public class SpringBoot2MultiDatabaseApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository rIproductRepository;
	@Autowired
	private CustomerRepository cIcustomerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2MultiDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		rIproductRepository.saveAll(Arrays.asList(new Product(10,"P1","PEN"),
				new Product(11,"P2","PAD"),
				new Product(12,"P3","BAG")
				
				
				));
		cIcustomerRepository.saveAll(Arrays.asList(new Customer(101, "a@gmail.com", "kailash"),
				
				new Customer(102, "b@gmail.com", "somesh"),
				new Customer(103, "c@gmail.com", "payal")
				));
		
		
		
	}

}
