package com.example.demo_gradle_jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/sample/*")
@RequestMapping("/sample")             // 아래에 나열한 path만 허용
public class SampleController2 {
    @RequestMapping("/aaa")
    public void aaa() {
        System.out.println("@RequestMapping : /sample/aaa");
    }

    @RequestMapping("/bbb")
    public void bbb() {
        System.out.println("@RequestMapping : /sample/bbb");
    }
}