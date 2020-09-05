package in.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Product;
import in.nit.repo.ProductRepository;
import in.nit.repo.ProductRepository.MyView;
@Component
public class FindByRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product(10, "A", "PEN", 10.5));
		repo.save(new Product(20, "B", "PENCIAL", 50.5));
		repo.save(new Product(30, "C", "LAPTOP", 700.5));
		repo.save(new Product(40, "B", "MOBILE", 800.5));
		List<MyView> p = repo.findByProdCode("B");
		for(MyView p1:p)
		 {
		System.out.println(p1.getProdCode()+","+p1.getProdName()+","+p1.getProdCost());
		}
		 }

//		repo.saveAll(Arrays.asList(new Product(1,"A", "prodName", 3.3),
//				new Product(2,"B", "PEN0", 2.2)));
//		
//		Product p = repo.findByProdCode("A");
//		System.out.println(p);
		//repo.findByProdCodeIsNull().forEach((System.out::println));
	}


