package com.example.part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
//https://www.json.org/json-en.html
//@ResponseBody: 자바객첼를 JSON으로 변환해주는 역할을 한다.
//@RquestBody : JSON을 자바객체로 변환해주는 역할을 한다.


@Slf4j
//@Controller
@RestController  // @controller + @ResponseBody 역할이다.
public class Hello {
	
	//http://localhost:8090/hello
     //@ResponseBody //객체를 프론트쪽으로 보낼 때 json으로 해서 보낸다.
     @GetMapping("/hello")
    //@RequestMapping("/hello")// 이건 쓰지 말자. 
	public String process() {
    	 log.info("info", "hello world");
         return "hello world";
     }
     
}
 