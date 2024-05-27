package com.example.demo.controller;
import com.example.demo.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AppController {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "welcome.jsp";
    }

    @GetMapping("/view")
    public String viewData(Model model){
        Employee emp = new Employee("Apeksha","apeksha@yahoo.com",90000);
        model.addAttribute("emp",emp);
        return "viewEmployee.jsp";
    }
}
