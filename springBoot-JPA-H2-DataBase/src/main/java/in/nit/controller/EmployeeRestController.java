package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Employee;
import in.nit.service.EmployeeService;

@RestController
@RequestMapping("/rest")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;
	@GetMapping("/getemp")
	public List<Employee> geEmployees() {
		return service.getEmployees();
		
	}
}
