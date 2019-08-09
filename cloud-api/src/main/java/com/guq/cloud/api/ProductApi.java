package com.guq.cloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-server")
public interface ProductApi {

    @RequestMapping("/test")
    public String test();
}
