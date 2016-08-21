package com.zhaochao.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
@EnableAutoConfiguration
public class Main {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/")
	public String index(Map<String,Object> map) {

		String sql="select * from user";

		List<Map<String,Object>> users=jdbcTemplate.queryForList(sql);
		for(Map<String,Object> user:users){
			for(Map.Entry<String,Object> en:user.entrySet()){
				System.out.println(en.getKey()+" "+en.getValue());
			}
		}

		map.put("users",users);
		map.put("host", "http://v.zjol.com.cn");
		return "index";
	}

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);

	}

}
