package com.sparta.week06.controller;

import com.sparta.week06.security.UserDetailsImpl;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) { // 스프링 시큐리티가 전달해주는 부분
        model.addAttribute("username", userDetails.getUsername());
        return "index";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/admin")
    public String admin(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        model.addAttribute("username", userDetails.getUsername());
        model.addAttribute("admin", true);
        return "index";
    }
}