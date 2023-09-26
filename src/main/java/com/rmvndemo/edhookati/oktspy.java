package com.rmvndemo.edhookati;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class oktspy {
	@GetMapping("/in")
	public String run() {
		String i="Hello , Welcome to spring and jenkins";
		return i +"  " +123 + "Project";
	}

}
