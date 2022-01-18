package kr.ac.kopo.bucketlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.bucketlist.model.Notice;
import kr.ac.kopo.bucketlist.service.NoticeService;
import kr.ac.kopo.bucketlist.util.Pager;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	final String path="notice/";
	@Autowired
	NoticeService service;
	@RequestMapping({"/","notice"})
	public String notice(Model model,Pager pager) {
		List<Notice> notice =service.notice(pager);
		model.addAttribute("notice",notice);
		return path+"notice";
	}
	@GetMapping("/add")
	public String add() {
		return path+"add";
	}
	@PostMapping("/add")
	public String add(Notice item) {
		service.add(item);
		return "redirect:.";
	}
	@GetMapping("/update/{code}")
	public String update(@PathVariable int code,Model model) {
		Notice item =service.item(code);
		model.addAttribute("item",item);
		return path+"update";
	}
	@PostMapping("/update/{code}")
	public String update(@PathVariable int code,Notice item) {
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
		Notice item = service.item(code);
		model.addAttribute("item", item);
		return path+"view";
	}
}
