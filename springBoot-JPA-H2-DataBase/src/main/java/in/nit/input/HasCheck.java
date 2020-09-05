package in.nit.input;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.nit.model.Brand;

@Component
@ConfigurationProperties(prefix = "my.prod")
public class HasCheck implements CommandLineRunner {
	
	private Brand brand;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "HasCheck [brand=" + brand + "]";
	}

	public HasCheck() {
		super();
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(this);
	}
	
	
	
	
	
	

}
