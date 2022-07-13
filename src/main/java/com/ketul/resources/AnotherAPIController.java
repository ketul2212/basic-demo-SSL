package com.ketul.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/another")
public class AnotherAPIController {

    @GetMapping("/")
    public String another() {
        return "You are inside another Api";
    }
}
