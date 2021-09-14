package com.rent.owner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Owner!";
    }
}
