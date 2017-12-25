package com.yan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hp yan on 2017/12/18.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017.  All Rights Received
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://eurekaclient/hi?name="+name,String.class);
    }

    }
