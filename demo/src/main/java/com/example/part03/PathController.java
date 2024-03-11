package com.example.part03;



import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

//http://localhost:8090/pathcall/a001/5000
@Slf4j
@RestController
public class PathController {
      @GetMapping("/pathcall/{code}/{price}")
	public HashMap<String, Object> pathExecute(@PathVariable(name="code") String code, 
			                                   @PathVariable(name="price")int price){
    	  log.info("code:{},price:{}", code, price);
    	  HashMap<String, Object> map = new HashMap<String, Object>();
    	  map.put("code", map);
    	  map.put("price", price);
    	  return map;
      }
}
