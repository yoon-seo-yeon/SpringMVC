package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
   @RequestMapping(value="/", method=RequestMethod.GET)
   //get 방식으로 /에 접속했을 때 아래 메서드를(home)실행해라
   public String home() {
      System.out.println("home");
      return "index";
   }
   // /test로 접속했을 때 test콘솔로 출력
}