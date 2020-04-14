package com.zk.myspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigBean {
	@Autowired
	Person person;
	
	@RequestMapping("/demo")
	public Person sayHello(){
		return person;
	}
}
