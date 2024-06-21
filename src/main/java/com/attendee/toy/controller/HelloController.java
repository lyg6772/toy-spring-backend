package com.attendee.toy.controller;

import com.attendee.toy.model.HelloResponseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/name")
    public HelloResponseModel getHelloName(@RequestParam String name){
        HelloResponseModel helloResponseModel = new HelloResponseModel();
        helloResponseModel.setUser_name(name);
        return helloResponseModel;

    }
}
