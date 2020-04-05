package web.backtospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import web.backtospring.entities.Member;
import web.backtospring.services.MemberService;

import javax.validation.Valid;

@Controller
public class memberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/login")
    public String showLoginForm(){
        return "views/loginForm";
    }


    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("member", new Member());
        return "views/registerForm";
    }
    @PostMapping("/register")
    public String registerMember(@Valid Member member){
        memberService.createMember(member);
        return "views/loginForm";
    }
}
