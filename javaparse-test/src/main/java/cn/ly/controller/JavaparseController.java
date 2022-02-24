package cn.ly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Javaparse")
public class JavaparseController {

    @GetMapping("/test")
    public void test(){
        System.out.println("test");
    }
}
