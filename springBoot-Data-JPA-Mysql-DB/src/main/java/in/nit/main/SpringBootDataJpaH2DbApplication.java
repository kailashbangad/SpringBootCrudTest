package in.nit.main;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.nit.model.Employee;
import in.nit.repo.EmployeeRepository;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = in.nit.repo.EmployeeRepository.class)
@EntityScan(basePackageClasses = in.nit.model.Employee.class)
@ComponentScan(basePackages = {"in.nit"})
public class SpringBootDataJpaH2DbApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaH2DbApplication.class, args);
		System.out.println("Hello from start here ..........");
	}

	

}
