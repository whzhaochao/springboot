package com.zhaochao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


@Controller
@EnableAutoConfiguration
public class Main {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/")
	public String index(Map<String,Object> map) {
		map.put("host", "http://v.zjol.com.cn");
		return "index";
	}

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);

	}

}
