package in.nit.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.product.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
