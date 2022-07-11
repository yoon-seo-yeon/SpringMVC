package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class uploadController {
	@GetMapping("/upload")
	public String upload_form() {
		return "upload/upload_form";
	}
	
	@PostMapping("/upload")
	public String re_upload(MultipartFile file, ModelAndView mv) {
		//file:업로드하는 파일에 대한 모든 정보를 가지고 있음
		System.out.println("filename : " + file.getOriginalFilename());
		System.out.println("filesize : " + file.getSize());
		System.out.println("filetype : " + file.getContentType());
		System.out.println("filename2 : " + file.getName());
		
		return "upload/result";
	}
}