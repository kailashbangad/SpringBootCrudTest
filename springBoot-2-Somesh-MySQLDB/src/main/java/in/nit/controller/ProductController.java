package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Product;
import in.nit.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService service;
	
	@GetMapping("/show")
	public String showData() {
		return "ProductRegister";
	}
		
		@PostMapping("/save")
		public String saveProd(
				@ModelAttribute Product product,
				Model model
				) 
		{
			Integer id = service.saveProduct(product);
			model.addAttribute("message", "SAVED WITH ID : "+id);
			return "ProductRegister";
		}
		@GetMapping("/all")
		public String getAll(Model model) {
			List<Product> list = service.getAllProducts();
			model.addAttribute("list", list);
			return "ProductData";
		}
		@GetMapping("/delete")
		public String remove(
				@RequestParam Integer id,
				Model model
				) 
		{
			service.deleteProduct(id);

			//display latest data
			List<Product> list = service.getAllProducts();
			model.addAttribute("list", list);

			//send message to ui
			model.addAttribute("message", "Product '"+id+"' Deleted");

			//return "redirect:all";
			return "ProductData";
		}
		@GetMapping("/edit")
		public String showEdit(
				@RequestParam Integer id, //read input
				Model model
				) 
		{
			//call service to get one object
			Product product  = service.getOneProduct(id);
			//send data to Form For Edit
			model.addAttribute("product", product);

			return "ProductEdit";
		}

		//6. on click update button
		@PostMapping("/update")
		public String update(
				@ModelAttribute Product product,Model model)
		{

			service.updateProduct(product);
			
			//display latest data
			List<Product> list = service.getAllProducts();
			model.addAttribute("list", list);

			//send message to ui
			model.addAttribute("message", "Product '"+product.getProdId()+"' Update");

			//return "redirect:all";
			return "ProductData";
		}


		
	}

