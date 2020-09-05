package in.nit.input;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation implements CommandLineRunner {
	@Value("${my.info.id}")
	private Integer idInteger;
	@Value("${my.info.name}")
	
	private String nameString;
	
	
	

	@Override
	public String toString() {
		return "ValueAnnotation [idInteger=" + idInteger + ", nameString=" + nameString + "]";
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public ValueAnnotation(Integer idInteger, String nameString) {
		super();
		this.idInteger = idInteger;
		this.nameString = nameString;
	}

	public ValueAnnotation() {
		super();
	}

	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}
}
