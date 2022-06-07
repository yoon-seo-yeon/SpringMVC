package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sub2")
public class TestController {
	/*
	@RequestMapping(value="/test1", method=RequestMethod.GET)
	public String test1() {
		return "index2";
	}
	
	@RequestMapping(value="/sub1/test3", method=RequestMethod.GET)
	public String test3() {
		return "index2";
	}
	
	@RequestMapping(value="/sub1/test4", method=RequestMethod.GET) 
	public String test4() {
		return "index2";
	}
	
	@RequestMapping(value="/sub2/test5", method=RequestMethod.GET) 
	public String test5() {
		return "index2";
	}
	
	@RequestMapping(value="/sub2/test6", method=RequestMethod.GET) 
	public String test6() {
		return "index2";
	}
	
	@RequestMapping(value="/sub2/test7", method=RequestMethod.GET) 
	public String test7() {
		return "index2";
	}
	*/
	
	@GetMapping("/test5")
	public String test5() {
		return "index2";
	}
	
	@GetMapping("/test6")
	public String test6() {
		return "index2";
	}
	
	@GetMapping("/test7")
	public String test7() {
		return "index2";
	}
}