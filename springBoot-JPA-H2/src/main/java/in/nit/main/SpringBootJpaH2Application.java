package in.nit.main;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.nit.dao.EmployeeRepository;
import in.nit.model.Employee;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = in.nit.dao.EmployeeRepository.class)
@ComponentScan(basePackages = {"in.nit"})

@EntityScan(basePackageClasses = in.nit.model.Employee.class)
public class SpringBootJpaH2Application implements CommandLineRunner{
	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootJpaH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try {
		repository.saveAll(Arrays.asList(new Employee(101, "kailash", "IT", 3.3),
				new Employee(102, "somesh", "IT", 8.3),
				new Employee(103, "payal", "COM", 2.3),
				new Employee(104, "kumar", "COM", 4.3),
				new Employee(105, "ritesh", "IT", 7.3)));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
