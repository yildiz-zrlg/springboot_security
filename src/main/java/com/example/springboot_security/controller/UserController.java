package com.example.springboot_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/admin")
    public String admin(){
        return "Admine özel mesajdır.";
    }
    @GetMapping("/index")
    public String index(){
        return "Index Sayfası, Hoşgeldiniz";
    }
    @GetMapping("/dashboard")
    public String dashboard(){
        return "Login başarılı dashboard sayfası";
    }

}

