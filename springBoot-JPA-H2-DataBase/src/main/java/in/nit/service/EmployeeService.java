package in.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Employee;
import in.nit.repository.EmployeeRepository;

@Service
public class EmployeeService  {

	@Autowired(required = true)
	private EmployeeRepository repo;

	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public void initDB() {
		List<Employee>employees=new ArrayList<>();
		employees.add(new Employee(101, "kailash", 3.0));
		employees.add(new Employee(102, "somesh", 3.3));
		employees.add(new Employee(103, "payal", 3.8));
		
	}
	
	public List<Employee> getEmployees() {
		return repo.findAll();
		
	}

}
