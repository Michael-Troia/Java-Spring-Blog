package com.example.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    public HomeController(){}

    @GetMapping("/")
    public String showHome(){
        return "index";
    }

    @GetMapping("/more")
    public String showMore() { return "more"; }

    @GetMapping("/projects")
    public String showProjects() { return "projects"; }

    @GetMapping("/what-im-doing")
    public String showWhatImDoing() { return "what-im-doing"; }

    @GetMapping("/projects/weather")
    public String showWeatherMap() { return "projects/weather"; }

    @GetMapping("projects/coffee")
    public String showCoffeeProj() { return "projects/coffee"; }
}
