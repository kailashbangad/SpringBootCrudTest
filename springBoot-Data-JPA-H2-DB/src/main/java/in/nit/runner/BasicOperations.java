package in.nit.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Employee;
import in.nit.repo.EmployeeRepository;

@Component
public class BasicOperations implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(
				new Employee(101, "kailash", 3.3),
				new Employee(102, "somesh", 4.3),
				new Employee(102, "somesh", 4.3)));
		
		//2.1 method.
		Optional<Employee> p = repo.findById(3);
		if(p.isPresent())
		 {
		System.out.println(p.get());
		} else {
		System.out.println("No Data found");
		}
		//2.2 Method.
		repo.findAll().forEach((System.out::println));
		/*3. *****************Delete****************/
		//3.1 Delete by specific Id
		repo.deleteById(3);
		//3.2 Delete all Rows one by one in (Sequence order)
	//	repo.deleteAll(); //Multiple Query fired No of record = no of Query
		//3.3 Delete all rows in Batch (Single Query fired)
		//repo.deleteAllInBatch();
		}
	}
	
	


