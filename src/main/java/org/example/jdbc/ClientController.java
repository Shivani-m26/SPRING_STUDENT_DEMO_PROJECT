package org.example.jdbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ClientController {



    @RequestMapping("/client")
    public String showClient(){
        return "client";
    }

    @RequestMapping("/submitClient")
    public ModelAndView addClient(@ModelAttribute ClientAdd client) {

        ModelAndView mv = new ModelAndView();

        mv.addObject("addClient", client);

        mv.setViewName("client");

        return mv;

    }
}

