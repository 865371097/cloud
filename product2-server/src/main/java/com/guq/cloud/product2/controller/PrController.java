package com.guq.cloud.product2.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrController {

    @RequestMapping("/test")
    public String test() {
        return "i am product2222-server";
    }

}
