package com.example.helloappcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
@GetMapping("/hello")
public String printHello() {
	return "Hello From Spring boot app";
}
}
