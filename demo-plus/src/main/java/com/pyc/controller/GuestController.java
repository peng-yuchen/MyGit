package com.pyc.controller;

import com.pyc.model.Guest;
import com.pyc.service.impl.GuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GuestController {
    @Autowired
    GuestServiceImpl guestService;

    @RequestMapping("guest")
    public String guest(Model model){
        List<Guest> list = new ArrayList<>();
        list = guestService.getGuest();
        model.addAttribute("list",list);
        System.out.println(list);
        return "thymeleaf/guest";
    }
}
