package in.nit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.Employee;

@Controller
@RequestMapping("/rest")
public class EmployeeController {
	
	
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String loginPageContainDisplay() {
		
		
		
		
		return "login";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String homePageContainDisplay() {
		
		
		
		
		return "home";
		
	}
	
	@RequestMapping("/show")
	public String showData(Model model) {
		System.out.println(model.getClass().getName());
//		model.addAttribute("eid", 101);
//		model.addAttribute("ename", "kailash");
//		model.addAttribute("esal", 21459.66);
		Employee employee=new Employee(101,"kailash",21456.00);
		model.addAttribute("ob", employee);
		return "Result";
		
	}

}
