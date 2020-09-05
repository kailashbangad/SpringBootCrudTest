package in.nit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController1 {
	
	@RequestMapping(value = "/show",method = RequestMethod.GET)
	public String showLogin(HttpServletRequest request) {
		System.out.println("URL: " +request.getRequestURL());
		return "loginPage";
		
	}

}
