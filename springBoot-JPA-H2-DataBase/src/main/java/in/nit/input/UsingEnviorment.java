package in.nit.input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UsingEnviorment implements CommandLineRunner {

	@Autowired
	private Environment env;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(env.getProperty("my.prod.ID"));
		System.out.println(env.getProperty("my.prod.code"));
		System.out.println(env.getProperty("my.prod.Ty_pe"));
		System.out.println(env.getProperty("my.prod.MOD-E_L"));
	}

}
