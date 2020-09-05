package in.nit.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import in.nit.profile.service.impl.ProdService;

@SpringBootApplication
@ComponentScan(basePackages = {"in.nit.profile"})

public class SpringBootJpaH2DataBaseApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaH2DataBaseApplication.class, args);
		System.out.println("Hello Spring Boot");
	
	}

	

}
