package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nit.dao.EmployeeRepository;
import in.nit.model.Employee;
@RestController
public class EmployeeController {
	
	  @Autowired
	private EmployeeRepository repo;
	
	
	
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee e) {
		
		repo.save(e);
		
		
		return "Employee save successfully";
		
	}
	@GetMapping("/getall")
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
		
	}
	@GetMapping("/getbydept/{dept}")
	public List<Employee> getEmployeeByDept(@PathVariable String dept) {
		return  repo.findByDept(dept);
		
	}

}
