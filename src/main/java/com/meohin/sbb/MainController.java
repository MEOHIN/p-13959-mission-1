package com.meohin.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/sbb")
    public void index() {
        System.out.println("안녕하세요 sbb에 오신 것을 환영합니다.");
    }

    @GetMapping("/")
    public String root () {
        return "redirect:/question/list";
    }
}
