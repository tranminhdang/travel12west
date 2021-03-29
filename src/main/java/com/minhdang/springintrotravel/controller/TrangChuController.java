package com.minhdang.springintrotravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/trangchu"})
public class TrangChuController {
	
	@GetMapping
	public String Index() {
		
		return "index";
	}

}
