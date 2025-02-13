package com.aula.accountms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
