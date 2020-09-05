package in.nit.config.product;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "db1EntityManagerFactory",transactionManagerRef = "db1TransactionManager",basePackages = "in.nit.repo.product"
	
		)
public class DbOneConfig {
	
	//datasource
	
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource db1DataSource() {
		return DataSourceBuilder.create().build();
		
	}
	//entity manager

	@Bean
	public LocalContainerEntityManagerFactoryBean db1EntityManagerFactory(
			EntityManagerFactoryBuilder emfBuilder) {
		HashMap<String, Object>proHashMap=new HashMap<>();
		proHashMap.put("hibernate.hbm2ddl.auto","create");
		proHashMap.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
		
		return emfBuilder.dataSource(db1DataSource())
				.packages("in.nit.model.product")
				.properties(proHashMap)
				.build();
		
	}
	//transction manager
	
	@Bean
	public PlatformTransactionManager db1TransactionManager(
			@Qualifier("db1EntityManagerFactory")EntityManagerFactory entityManagerFactory
			
			) {
		
		return new JpaTransactionManager(entityManagerFactory);
		
	}

}
