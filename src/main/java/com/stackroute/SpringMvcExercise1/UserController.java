package com.stackroute.SpringMvcExercise1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("/")
        public String greet(Model model){
        User u = new User("srujana");
        model.addAttribute("name",u.getName());
        return "index";

   /* public ModelAndView hello() {
        ModelAndView model = new ModelAndView();
        User u=new User("Srujana");
        model.addObject("name", "srujana");
        return model;*/
    }
}

