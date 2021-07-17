package com.springmvc.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("web")
public class HomeController {
    @RequestMapping("/home")
    public ModelAndView homePage(){
        ModelAndView mav = new ModelAndView("web/home");
        return mav;
    }

}
