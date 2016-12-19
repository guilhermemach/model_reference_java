package com.machado.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class LoginController {
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public @ResponseBody Login getShopInJSON(@RequestBody Login log) {
		
		System.out.println("##########################################");
		System.out.println(log.getUsuario());
		System.out.println(log.getSenha());
		
		return log;
	}
}