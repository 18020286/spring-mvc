package com.springmvc.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("room-web")
public class RoomController {
    @RequestMapping("/room")
    public ModelAndView roomPage(){
        ModelAndView mav = new ModelAndView("web/room");
        return mav;
    }
}
