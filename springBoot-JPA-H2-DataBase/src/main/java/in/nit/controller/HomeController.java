package in.nit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/rest")
public class HomeController {
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "/show",method = RequestMethod.GET)
	public String showLogin() {
		System.out.println("URL: " +request.getRequestURL());
		return "loginPage";
		
	}
	
	
	
	


}
