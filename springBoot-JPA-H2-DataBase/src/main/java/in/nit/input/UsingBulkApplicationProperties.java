package in.nit.input;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.prod")
public class UsingBulkApplicationProperties implements CommandLineRunner {

	private int id;
	private String code;
	private boolean type;
	private String model;
	private List<String> listOfProjectName;
	private Set<String> setOfProjectName;
	private String[] arrayOfProjectname;
	private Map<String, String> details;
	private Properties info;

	@Override
	public String toString() {
		return "UsingBulkApplicationProperties [id=" + id + ", code=" + code + ", type=" + type + ", model=" + model
				+ ", listOfProjectName=" + listOfProjectName + ", setOfProjectName=" + setOfProjectName
				+ ", arrayOfProjectname=" + Arrays.toString(arrayOfProjectname) + ", details=" + details + ", info="
				+ info + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<String> getListOfProjectName() {
		return listOfProjectName;
	}

	public void setListOfProjectName(List<String> listOfProjectName) {
		this.listOfProjectName = listOfProjectName;
	}

	public Set<String> getSetOfProjectName() {
		return setOfProjectName;
	}

	public void setSetOfProjectName(Set<String> setOfProjectName) {
		this.setOfProjectName = setOfProjectName;
	}

	public String[] getArrayOfProjectname() {
		return arrayOfProjectname;
	}

	public void setArrayOfProjectname(String[] arrayOfProjectname) {
		this.arrayOfProjectname = arrayOfProjectname;
	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

	public Properties getInfo() {
		return info;
	}

	public void setInfo(Properties info) {
		this.info = info;
	}

	public UsingBulkApplicationProperties(int id, String code, boolean type, String model,
			List<String> listOfProjectName, Set<String> setOfProjectName, String[] arrayOfProjectname,
			Map<String, String> details, Properties info) {
		super();
		this.id = id;
		this.code = code;
		this.type = type;
		this.model = model;
		this.listOfProjectName = listOfProjectName;
		this.setOfProjectName = setOfProjectName;
		this.arrayOfProjectname = arrayOfProjectname;
		this.details = details;
		this.info = info;
	}

	public UsingBulkApplicationProperties() {
		super();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.toString());

	}

}
