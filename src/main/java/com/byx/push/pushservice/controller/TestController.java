package com.byx.push.pushservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @version 1.0-SNAPSHOT
 * @since 2019/7/31
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "ok";
    }
}
