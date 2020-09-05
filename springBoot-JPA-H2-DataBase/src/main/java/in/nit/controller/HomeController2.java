package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController2 {
	
	
	
	
	
	@RequestMapping("/newfile")
	public String newFile() {
		return "NewFile";
		
	}
	
	@RequestMapping(value = "/success",method = RequestMethod.POST)
	public String success() {
		return "Success";
		
	}
	@RequestMapping(
			value={
					"/login",
					"/home1",
					"/logout"
			})
	public String showLogin(){
		return "LoginPage";
	}
	
	@RequestMapping("/home")
	public String showHome() {
		return "Home34";
	}
	
	@RequestMapping(
			value="/show",
			method = {
					RequestMethod.GET,
					RequestMethod.POST
			})
	public String multipleRequestmethod(){
		return "LoginPage";
	}

}
