package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c[] = request.getParameterValues("c");
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		for(String str : c) {
			System.out.println("c : " + str);
		}
		
		return "result";
	}
	
	@GetMapping("/result2/{a}/{b}/{c}")
	public String result2(@PathVariable String a,
						  @PathVariable String b,
						  @PathVariable String c) {
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		return "result";
	}
	
}