package in.nit.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//	//select * from prodtab where prod_code=prodCode;
//	
//	Product findByProdCode(String prodCode);
//	
//	//select * from prodtab where prod_code like prodCode
//	List<Product> findByProdCodeLike (String pc);
//	//select * from prodtab where prod_code is null
//	List<Product> findByProdCodeIsNull();
//	//select * from prodtab where prod_cost=cost
//	List<Product> findByProdCostGreaterThan(Double cost);
//	//select * from prodtab where prod_cost in (cost)
//	List<Product> findByProdCostIn(Collection<Double> costs);
//	//select * from prodTab where pid=? Or pcost=?
//	List<Product> findByProdIdOrProdCost(Integer pid, Double cost);
//	//select * from prodtab where pid between pid1 and pid2
//	List<Product> findByProdIdBetween (Integer pid1, Integer pid2);
//	//select * from prodtab where p_cost=? Order by prod_code asc
//	List<Product> findByProdCostLessThanOrderByProdCode(Double cost);
//	//Select * from prodtab where pid<=? And pcost>=? And vendor is not null order by pcode;
	
	interface MyView {
		//Copy from getter method (RT and methodName)
		String getProdCode();
		 String getProdName();
		Double getProdCost();
		}
		//select code, cost from prodtab where ven_code=?
		List<MyView> findByProdCode(String string);
		}
	
