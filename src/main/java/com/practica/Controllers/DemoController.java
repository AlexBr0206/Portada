package com.practica.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/Demo/Portada")
	public String Portada() {
		return "Portada";
	}

}
