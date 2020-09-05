package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.Product;
@Repository
public interface IProductRepository extends JpaRepository<Product, Integer>{

}
