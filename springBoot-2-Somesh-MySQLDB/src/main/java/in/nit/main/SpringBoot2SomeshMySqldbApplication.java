package in.nit.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = in.nit.repo.IProductRepository.class)
@EntityScan(basePackageClasses = in.nit.model.Product.class)
@ComponentScan(basePackageClasses = in.nit.controller.ProductController.class)
public class SpringBoot2SomeshMySqldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2SomeshMySqldbApplication.class, args);
	}

}
