package in.nit.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"in.nit"})
@EntityScan(basePackageClasses  = in.nit.model.Employee.class)
@EnableJpaRepositories(basePackageClasses = in.nit.repository.EmployeeRepository.class)
public class ThymeleafCrudWebAppSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafCrudWebAppSpringBootApplication.class, args);
	}

}
