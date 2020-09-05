package in.nit.config.customer;

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
@EnableJpaRepositories(entityManagerFactoryRef = "db2EntityManagerFactory",
transactionManagerRef = "db2TransactionManager",
basePackages = "in.nit.repo.customer"

		)
public class Db2Config {

	// datasource
	@Primary
	@Bean
	@ConfigurationProperties(prefix = "spring2.datasource")
	public DataSource db2DataSource() {
		return DataSourceBuilder.create().build();

	}

	// entity manager
	@Primary
	@Bean
	public LocalContainerEntityManagerFactoryBean db2EntityManagerFactory(
			EntityManagerFactoryBuilder emfBuilder
			) {
		
		HashMap<String, Object> proHashMap = new HashMap<>();
		proHashMap.put("hibernate.hbm2ddl.auto", "create");
		proHashMap.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");

		return emfBuilder.dataSource(db2DataSource())
				.packages("in.nit.model.customer")
				.properties(proHashMap)
				.build();

	}

	// transction manager
	@Primary
	@Bean
	public PlatformTransactionManager db2TransactionManager(
			@Qualifier("db2EntityManagerFactory") EntityManagerFactory entityManagerFactory

			) {

		return new JpaTransactionManager(entityManagerFactory);

	}

}
