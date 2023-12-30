package com.vismee.ThymeleafDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/* Controller to display the basic form - just a text field. To read the form field,
   using HttpServletRequest and also special annotation called : @RequestParam */
@Controller
public class FormController
{
    @RequestMapping("/showForm")
    public String showForm()
    {
        return "basicform";
    }

    @RequestMapping("/processForm")
    public String processForm()
    {
        return "greetStudent";
    }

    @RequestMapping("/processFormData")
    public String processFormData(HttpServletRequest request,Model model)
    {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();

        String result = "Hello " +name;

        model.addAttribute("data",result);
        return "greetStudent";
    }

    @PostMapping("/processFormDataReq")
    public String processFormDataReq(@RequestParam("studentName") String theName,Model model)
    {
        theName = theName.toUpperCase();

        String result = "Hello Mr. " + theName;

        model.addAttribute("data",result);
        return "greetStudent";
    }
}
