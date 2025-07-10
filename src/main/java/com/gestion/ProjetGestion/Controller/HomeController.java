package com.gestion.ProjetGestion.Controller;

import com.gestion.ProjetGestion.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "/ch1")
    public String afficheMessage(){
        return homeService.m1();
    }

    @RequestMapping(value = "/ch2")
    public String afficheDate(){
        return homeService.m2().toString();
    }
    @RequestMapping("/ch3")
    public String afficheMessage3(){
        return homeService.m3();
    }

}
