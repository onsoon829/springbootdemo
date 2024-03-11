package com.example.part02;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

//http://localhost.8090/hellomodel
//{"num":1, "name": "홍길동", "age":30, "loc": "서울"}
@Slf4j
@RestController
public class HelloPostController {
	
	@PostMapping("/hellomodel")//package는 달라도 하나로 묶여있으므로(?) 출력값 다르게 해야 한다?
	public MemDTO postExecute(@RequestBody MemDTO dto) {//json으로 넘어온 거를 객체로 바꿔서 넘기겠다.
		log.info("dto {}", dto);
		return dto;
	}

}
