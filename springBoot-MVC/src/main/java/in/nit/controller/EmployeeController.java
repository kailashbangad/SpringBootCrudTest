package in.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.Employee;

@Controller
@RequestMapping(value ="/rest")
public class EmployeeController {
	
	
	@RequestMapping(value = "/home",method =RequestMethod.GET)
	public String showHome(Model model) {
		model.addAttribute("eid", 101);
		model.addAttribute("ename", "kailash");
		model.addAttribute("esal", 24500.35);
	
		
		
		return "Home";
		
	}
	
	
	@RequestMapping(value = "/emp",method =RequestMethod.GET)
	public String showResult(Model model) {
		
	Employee e=new Employee(101,"kailash",24555.55);
	model.addAttribute("ob", e);
	
	
		
		
		return "Result";
		
	}
	
	@RequestMapping("/show")
	public String showData(Model model) {
		System.out.println(model.getClass().getName());
		
		List<String> list = List.of("A","B","C");
		model.addAttribute("list", list);
		
		
		Map<String,String> map = Map.of("K1","V1","K2","V2");
		model.addAttribute("map", map);
		
		
		return "Result";
	}
	
	@RequestMapping("/listofempshow")
	public String showListOfEmployee(Model model) {
		
		List<Employee> list = List.of(
					new Employee(101, "A", 3.3),
					new Employee(102, "D", 5.3),
					new Employee(103, "C", 8.3),
					new Employee(104, "B", 2.3)
				);
		model.addAttribute("emps", list);
		
		
		return "Result2";
	}
	@RequestMapping(value = "/modelAndView",method = RequestMethod.GET)
	public ModelAndView showRegisterPage() {
		ModelAndView m=new ModelAndView();
//		m.setViewName("JspByUsingModelAndView");
//		m.addObject("Firstname", "kailash");
//		m.addObject("Middlename:", "jugalkishor");
//		m.addObject("Lastname:", "bangad");
		return m;
		
	}
	@RequestMapping(value = "/showStudentRegisterData",method = RequestMethod.GET)
	public ModelAndView showRegisterPageData() {
		ModelAndView m=new ModelAndView();
		m.setViewName("showStudentRegisterDataByUsingModelAndView");
		m.addObject("Firstname", "kailash");
		m.addObject("Middlename:", "jugalkishor");
		m.addObject("Lastname:", "bangad");
		return m;
		
	}
	@RequestMapping(value = "/showModelMapStudentRegisterData",method = RequestMethod.GET)
	public String showModelMapStudentRegisterData(ModelMap m) {
		//ModelAndView m=new ModelAndView();
		
		m.addAttribute("eid", 101);
		m.addAttribute("ename", "jugalkishor");
		m.addAttribute("esal", 11545.90);
		return "Home";
		
	}
	@RequestMapping("/modelMapCollectionData")
	public String modelMapCollectionData(Map<String,Object> model) {
		System.out.println(model.getClass().getName());
		//Impl class : BindingAwareModelMap
		model.put("sid", 555);
		model.put("sname", "SYED");
		model.put("sfee", 650.0);
		return "Home";
	}
	@GetMapping("/demo")
	public String showDemo() {
		return "demo";
		
		
	}
	

}
