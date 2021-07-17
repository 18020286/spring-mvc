package com.springmvc.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("room-admin")
public class RoomController {
    @RequestMapping("/admin/room")
    public ModelAndView roomAdmin(){
        ModelAndView mav = new ModelAndView("admin/room");
        return mav;
    }
}
