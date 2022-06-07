package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3[] = request.getParameterValues("data3");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(String str : data3) {
			System.out.println("data3 : " + str);
		}
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(WebRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3 = request.getParameter("data3");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		
		return "result";
	}
	
	//<a href = "test4/100/200/300">test4 PathVariable</a><hr>
	@GetMapping("/test4/{data1}/{data2}/{data3}")	//100을 data1에 200을 data2에 300을 data3에
	public String test4(@PathVariable String data1, 
						@PathVariable String data2,
						@PathVariable String data3) {
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		return "result";
	}
	
	@GetMapping("/test5")
	public String test5(@RequestParam int data1,
						@RequestParam int data2,
						@RequestParam int []data3) {
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(int str : data3) {
			System.out.println("data3 : " + str);
		}
		
		return "result";
	}
}