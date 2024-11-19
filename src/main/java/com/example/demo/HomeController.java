package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String _home(){
        return "Hello, World!";
    }
    @GetMapping("/class")
    @ResponseBody
    public String _class(){
        return "Hello, spring class";
    }
    @GetMapping("/index1")
    public String _index1(Model m) {
        m.addAttribute("message", "hello");
        return "index";
    }
    
}
