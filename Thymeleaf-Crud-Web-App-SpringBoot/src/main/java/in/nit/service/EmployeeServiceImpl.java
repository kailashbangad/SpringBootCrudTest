package in.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Employee;
import in.nit.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee>optional=repo.findById(id);
		Employee employee=null;
		if (optional.isPresent()) {
			employee=optional.get();
			
		}else {
			throw new RuntimeException("Employee not found with given Id::"+id);
		}
		
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.repo.deleteById(id);
		
		
	}

}
