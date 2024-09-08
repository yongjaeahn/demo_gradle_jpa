package com.example.demo_gradle_jpa.controller;

import com.example.demo_gradle_jpa.domain.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sample/*")     // 아래와 같은 path를 모두 수용
//@RequestMapping("/sample")
public class SampleController {
    @RequestMapping("")
    public void basic() {
        System.out.println("@RequestMapping : /sample/*");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO sampleDTO) {
        System.out.println("@GetMapping : /sample/ex01");
        System.out.println(sampleDTO);

        return "ex01";
    }

    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
        System.out.println("@GetMapping : /sample/ex02");
        System.out.print("@RequestParam(\"name\") String name : ");
        System.out.println(name);
        System.out.print("@RequestParam(\"age\") int age : ");
        System.out.println(age);

        return "ex02";
    }
}
