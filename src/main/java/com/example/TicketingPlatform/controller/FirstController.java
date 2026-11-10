package com.example.TicketingPlatform.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {  // Model(데이터) 객체 받아오기
        model.addAttribute("userName", "유정");
        return "greetings"; // 컨트롤러에서 뷰페이지 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickName", "유정");
        return "goodbye";
    }

}