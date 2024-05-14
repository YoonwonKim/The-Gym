package com.ecom4.custom.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomController {
	
	@RequestMapping("test")
	public String test() {
			
			
		return "Test";
	}
}
