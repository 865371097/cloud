package com.guq.cloud.customer.controller;

import com.guq.cloud.api.ProductApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {

    @Autowired
    private ProductApi productApi;

    @RequestMapping("/test")
    public String test() {
        return productApi.test();
    }
}
