package in.nit.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.model.Product;
import in.nit.repo.IProductRepository;
import in.nit.service.IProductService;
import lombok.experimental.var;
@SuppressWarnings("deprecation")
@Service // cal + Oper + Sorting+Tx
public class ProductServiceImpl implements IProductService{
	@Autowired
	private IProductRepository repo;

	@Override
	public Integer saveProduct(Product p) {//calculations
		//JDK 10-var reserve word
		var cost = p.getProdCost();

		var disc = cost * 12/100.0;
		var gst = cost * 8/100.0;

		p.setProdGst(gst);
		p.setProdDiscount(disc);

		return repo.save(p).getProdId();
		
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		var cost = p.getProdCost();

		var disc = cost * 12/100.0;
		var gst = cost * 8/100.0;

		p.setProdGst(gst);
		p.setProdDiscount(disc);
		repo.save(p);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Product> getAllProducts() {
		
		List<Product>list=repo.findAll();
		Collections.sort(list,(o1,o2)->o1.getProdCode().compareTo(o2.getProdCode()));
		
		return list;
	}

	@Override
	public Product getOneProduct(Integer id) {
		Optional<Product>optional=repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
			
		}
		return null;
	}

	
}
