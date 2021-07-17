package com.springmvc.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("admin")
public class HomeController {
    @RequestMapping("/admin")
    public ModelAndView adminPage(){
        ModelAndView mav = new ModelAndView("admin/home");
        return mav;
    }
}
