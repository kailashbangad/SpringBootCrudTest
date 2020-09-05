package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
