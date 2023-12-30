package com.vismee.ThymeleafDemo.controller;

import com.vismee.ThymeleafDemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/* Controller for displaying student form and processing the form.
   Note:
   1. Using Java bean to hold form data instead of using @RequestParam individually
   2. Injecting properties from application.properties file and adding it to the model so the form can
      use the options dynamically from properties file
*/
@Controller
public class StudentController
{
    @Value("${countries}")
    private List<String> countries;

    @Value("${groups}")
    private List<String> groups;

    @Value("${colleges}")
    private List<String> colleges;

    @GetMapping("/showStudentForm")
    public String studentForm(Model model)
    {
        model.addAttribute("student",new Student());
        model.addAttribute("countries",countries);
        model.addAttribute("groups",groups);
        model.addAttribute("colleges",colleges);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent)
    {
        System.out.println("Name : " +theStudent.getFirstName() + " " +theStudent.getLastName());
        return "student-confirmation";
    }
}
