package com.nikischultz.firstprojectspring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping(value = {"/", "", "/index"})
    public String index() {
        return "/index";
    }


    @GetMapping(value = {"/about", "about"})
    public String about() {
        return "about";
    }


}
