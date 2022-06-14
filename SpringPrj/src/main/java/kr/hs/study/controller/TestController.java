package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
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
	
	@PostMapping("/mul_form")
	public String mul_result(@RequestParam String num) {
		for(int i = 1; i <= 9; i++) {
			System.out.println();
		}
		
		return "result";
	}
	
	//성적 구하기
	@GetMapping("/score")
	public String score_form() {
		return "score_form";
	}
	
	@PostMapping("/score_form")
	public String test3(Score score) {
		int ko = score.getKo();
		int en = score.getEn();
		int ma = score.getMa();
		int sp = score.getSp();
		
		System.out.println("이름 : " + score.getName());
		System.out.println("국어 : " + score.getKo());
		System.out.println("영어 : " + score.getEn());
		System.out.println("수학 : " + score.getMa());
		System.out.println("스프링 : " + score.getSp());
		System.out.println("총점 : " + score.total());
		System.out.println("평균 : " + score.avg());
		
		return "result";
	}
}