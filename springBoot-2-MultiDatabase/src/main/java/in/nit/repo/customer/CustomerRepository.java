package in.nit.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.customer.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
