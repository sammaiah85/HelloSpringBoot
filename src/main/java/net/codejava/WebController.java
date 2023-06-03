/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sammaiah
 */
@Controller
public class WebController {
    
    @RequestMapping("/hello")
    public String sayHello(Model model)
    {
        model.addAttribute("message", "Welcome to Spring Boot App");
        return "hello";
    }
    
}
