package kr.ac.kopo.bucketlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.bucketlist.model.Application;
import kr.ac.kopo.bucketlist.service.ApplicationService;
import kr.ac.kopo.bucketlist.util.Pager;

@Controller
@RequestMapping("/application")
public class ApplicationController {
	final String path="application/";
	@Autowired
	ApplicationService service;
	
	@RequestMapping({"/","/application"})
	public String application(Model model,Pager pager) {
		List<Application> application =service.application(pager);
		model.addAttribute("application",application);
		return path+"application";
	}
	@GetMapping("/add")
	public String add() {
		return path+"add";
	}
	@PostMapping("/add")
	public String add(Application item) {
		service.add(item);
		return "redirect:.";
	}
	@GetMapping("/update/{code}")
	public String update(@PathVariable int code,Model model) {
		Application item=service.item(code);
		model.addAttribute("item",item);
		return path+"update";
	}
	@PostMapping("/update/{code}")
	public String update(@PathVariable int code,Application item) {
		item.setCode(code);
		service.update(item);
		return "redirect:..";
	}
	@GetMapping("/delete/{code}")
	public String delete(@PathVariable int code) {
		service.delete(code);
		return "redirect:..";
	}
	@GetMapping("/view/{code}")
	public String view(@PathVariable int code,Model model) {
		Application item =service.item(code);
		model.addAttribute("item",item);
		return path+"view";
	}
}
