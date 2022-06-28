package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.Score;

@Controller
public class TestController {
	//구구단
	@GetMapping("/multipli")
	public String multipli() {
		return "multi_form";
	}
	
	@PostMapping("/multi_form")
	public String multi_form(@RequestParam("dan") int dan, Model model) {
//		String get_num = num;
		String result="";
		for(int i = 1; i <= 9; i++) {
			result += dan + "*" + i + "=" + i*dan + "<br/>";
		}
		
		model.addAttribute("result", result);
		
		return "multi_result";
	}
	
	//성적 구하기
	@GetMapping("/score")
	public String score_form() {
		return "score_form";
	}
	
	@PostMapping("/score_form")
	public String score_form(Score score, Model model) {
		String name = score.getName();
		int ko = score.getKo();
		int en = score.getEn();
		int ma = score.getMa();
		int sp = score.getSp();
		int total = score.total();
		double avg = score.avg();
		
		//서버로 출력
		model.addAttribute("name", name);
		model.addAttribute("ko", ko);
		model.addAttribute("en", en);
		model.addAttribute("ma", ma);
		model.addAttribute("sp", sp);
		model.addAttribute("total", total);
		model.addAttribute("avg", avg);
		
		/*
		//콘솔로 출력
		System.out.println("�̸� : " + score.getName());
		System.out.println("���� : " + score.getKo());
		System.out.println("���� : " + score.getEn());
		System.out.println("���� : " + score.getMa());
		System.out.println("������ : " + score.getSp());
		System.out.println("���� : " + score.total());
		System.out.println("��� : " + score.avg());
		*/
		
		return "score_result";
	}
	
	//로그인
	@GetMapping("/login")
	public String login_form() {
		return "/login/login_form";
	}
	
	@PostMapping("/login_form")
	public String login_form(@RequestParam("userId") String userId, @RequestParam("userPass") String userPass, Model model) {
		if(userId.equals("kim") && userPass.equals("1111")) {
			model.addAttribute("userId", userId);
			model.addAttribute("userPass", userPass);
			
			return "/login/login_result";
		}
		else {
			return "redirect:/login_form";
		}
	}
}