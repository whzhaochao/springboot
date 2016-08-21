package com.zhaochao.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class App
{

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        return  "hello";
    }


    public static void main( String[] args )
    {

        SpringApplication.run(App.class,args);

    }
}
