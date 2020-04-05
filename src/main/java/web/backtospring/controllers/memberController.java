package web.backtospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {

    @GetMapping("/login")
    public String showLoginForm(){
        return "views/loginForm";
    }

    @GetMapping("/register")
    public String registerForm(Model model){
        return "views/registerForm";
    }
}
