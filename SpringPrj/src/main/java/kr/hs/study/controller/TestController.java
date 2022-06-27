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
	//������
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
	
	//���� ���ϱ�
	@GetMapping("/score")
	public String score_form() {
		return "score_form";
	}
	
	@PostMapping("/score_form")
	public String test3(Score score, Model model) {
		String name = score.getName();
		int ko = score.getKo();
		int en = score.getEn();
		int ma = score.getMa();
		int sp = score.getSp();
		int total = score.total();
		double avg = score.avg();
		
		//������ ���
		model.addAttribute("name", name);
		model.addAttribute("ko", ko);
		model.addAttribute("en", en);
		model.addAttribute("ma", ma);
		model.addAttribute("sp", sp);
		model.addAttribute("total", total);
		model.addAttribute("avg", avg);
		
		/*
		//�ַܼ� ���
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
}