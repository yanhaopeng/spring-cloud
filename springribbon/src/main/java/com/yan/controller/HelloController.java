package com.yan.controller;

import com.yan.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp yan on 2017/12/18.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017.  All Rights Received
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value="hi")
    public String hi (@RequestParam String name){
        String str = helloService.hiService(name);
        return str;
    }

}
