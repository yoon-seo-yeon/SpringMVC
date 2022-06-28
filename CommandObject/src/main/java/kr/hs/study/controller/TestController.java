package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.DataBean;

@Controller
public class TestController {
	/*
	@PostMapping("/test1")
	public String test1(DataBean bean, Model model) {
		model.addAttribute("bean", bean);
		
		return "re_test1";
	}
	*/
	
	//request영역에 객체이름 지정해서 저장하는 방법
	@PostMapping("/test1")
	public String test1(@ModelAttribute("testBean") DataBean bean, Model model) {
		model.addAttribute("bean", bean);
		
		return "re_test1";
	}
}