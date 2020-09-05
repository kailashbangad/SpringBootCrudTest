package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Employee;
import in.nit.repo.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repo;

	@GetMapping("/emp")
	public List<Employee> getEmployees() {

		return repo.findAll();

	}

}