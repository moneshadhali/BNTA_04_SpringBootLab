package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/greeting")
public class TaskController {

    @GetMapping
    public Greeting task(@RequestParam(required = false) String timeOfDay){
        return new Greeting("Colin", timeOfDay);
    }

    //URL USED:
    //http://localhost:8080/greeting?timeOfDay=10pm
    //http://localhost:8080/greeting

    @GetMapping("/summer")
    public Celebration task2(){
        return new Celebration("Happy summer solstice!");
    }

    //URL USED:
    //http://localhost:8080/greeting/summer

//    Optional way to do the same thing:
//    public String task(){
//        Greeting greet = new Greeting("Colin", "5pm");
//        return "Hello "+greet.getName()+" ! Its "+greet.getTimeOfDay();
//    }

}
