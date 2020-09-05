package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.nit.dao.UserDao;
import in.nit.model.User;

public class UserController {
	@Autowired
	private  UserDao service;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "LearnCodeWithRaghuSir!!");
		model.addAttribute("Desc", "code for javaLovers");
		
		
	}
	@GetMapping("/register")
	public String showRegisterPage() {
		return "RegisterPage";
		
	}
	@PostMapping("/display")
	public String displayRegisterData(
			@ModelAttribute("user")
			User
			user,
			Model model) {
		
		 
		
		System.out.println(user);
		//this.service.createUser(user);
		model.addAttribute("emps", user);
		return "viewRegisterPageData";
		
	}
	

}
