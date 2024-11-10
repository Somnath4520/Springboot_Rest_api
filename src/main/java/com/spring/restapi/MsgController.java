package com.spring.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	
	public MsgController() {
		System.out.println("msg controller::constructor");
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String>getWelcomeMsg(){
		String body = "Welcome to our new page";
		return new ResponseEntity<>(body,HttpStatus.OK);
	}

	@GetMapping("/greet")
	public String getGreet() {
		String msg = "Good morning!";
		return msg;
	}
	
	
}
