package com.hackaton.interbank.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class LayourController {

	
	@GetMapping("/Index")
	public String mosttrarVista() {
		return "index";
	}
}