package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
	public class HomeController3 {

		@RequestMapping("/view")
		public String showHome() {
			return "NewFile";
		}
		
		@RequestMapping(
				value="/success",
				method = {
						RequestMethod.GET,
						RequestMethod.POST
				})
		public String showLogin(){
			return "Success";
		}
		
		
		@RequestMapping("/data")
		public String showData() {
			System.out.println("FROM DATA METHOD");
			return "Data";
		}
		
		/**
		 * If we enter /delete in browser then
		 * homeController.remove() method is executed
		 * and moved to homeController.showData() method.
		 * Finally Data.jsp will be displayed. 
		 */
		
		@RequestMapping("/delete")
		public String remove() {
			System.out.println("FROM DELETE METHOD");
			return "redirect:data"; //do not provide slash
		}
		
		@RequestMapping("/activate")
		public String doActivate(){
		//logic..
		return"redirect:data";//EnterURLwithoutslash/symbol.

	}


}
