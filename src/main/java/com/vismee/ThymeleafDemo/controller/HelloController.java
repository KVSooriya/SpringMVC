package com.vismee.ThymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// A basic controller code to display the date and time
@Controller
public class HelloController
{
    @GetMapping("/hello")
    public String sayHello(Model theModel)
    {
        theModel.addAttribute("theData",new java.util.Date());
        return "helloworld";  // looks at thymeleaf template under src/main/resources/templates/helloworld.html
    }
}
