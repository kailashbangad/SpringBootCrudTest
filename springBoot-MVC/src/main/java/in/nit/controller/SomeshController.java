package in.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeshController {
	@GetMapping("/somesh")
	public String hello() {
		return "Hello i  am java devloper";
		
	}

}
