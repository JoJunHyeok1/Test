package kr.ac.kopo.bucketlist.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.bucketlist.model.Recruit;
import kr.ac.kopo.bucketlist.service.RecruitService;
import kr.ac.kopo.bucketlist.util.Pager;

@Controller
@RequestMapping("/recruit")
public class RecruitController {
	final String path = "recruit/";
	@Autowired
	RecruitService service;

	@RequestMapping({ "/", "recruit" })
	public String recruit(Model model, Pager pager) {
		List<Recruit> list = service.recruit(pager);
		model.addAttribute("recruit", list);
		return path + "recruit";
	}
	@GetMapping("/add")
	public String add() {
		return path+"add";
	}
	@PostMapping("/add")
	public String add(Recruit item) {
		service.add(item);
		return "redirect:.";
	}
	@GetMapping("/update/{code}")
	public String update(@PathVariable int code, Model model) {
		Recruit item = service.item(code);
		model.addAttribute("item",item);
		return path+"update";
	}
	@PostMapping("/update/{code}")
	public String update(@PathVariable int code, Recruit item) {
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
	public String view(@PathVariable int code, Model model) {
		Recruit item = service.item(code);
		model.addAttribute("item",item);
		return path+"view";
	}
}
