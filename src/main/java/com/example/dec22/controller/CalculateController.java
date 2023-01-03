package com.example.dec22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Calculate")
public class CalculateController {

    @GetMapping("/add/{first}/{second}")
    public double add(@PathVariable("first")double firstnumber,
                      @PathVariable("second")double secondnumber){
        return firstnumber+secondnumber;
    }

    @GetMapping("/sub/{first}/{second}")
    public double sub(@PathVariable("first")double firstnumber,
                      @PathVariable("second")double secondnumber){
        return firstnumber-secondnumber;
    }

    @GetMapping("/mul/{first}/{second}")
    public double mul(@PathVariable("first")double firstnumber,
                      @PathVariable("second")double secondnumber){
        return firstnumber*secondnumber;
    }

    @GetMapping("/div/{first}/{second}")
    public double div(@PathVariable("first")double firstnumber,
                      @PathVariable("second")double secondnumber){
        if(secondnumber==0) {
            return firstnumber/1;
        }
        else
        return firstnumber/secondnumber;
    }

}
