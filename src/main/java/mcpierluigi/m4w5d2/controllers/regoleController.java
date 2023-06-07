package mcpierluigi.m4w5d2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regole")
public class regoleController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}

	@GetMapping("/{lingua}")
	public String getRegole(@PathVariable String lingua) {
		if(lingua.equals("it")) {
			return "Queste sono le regole:";
		} else if (lingua.equals("en")) {
			return "These are the rules:";
		} else {
			return "Inserisci una lingua valida";
		}
	}
	
}
