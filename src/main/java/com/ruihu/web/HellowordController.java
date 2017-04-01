package com.ruihu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HellowordController {
	
	
	@RequestMapping("/")
    public String sayHello(){
    	return "index";
    }
}
