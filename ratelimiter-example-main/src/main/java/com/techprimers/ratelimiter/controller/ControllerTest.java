package com.techprimers.ratelimiter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.ratelimiter.InOutDto;
import com.techprimers.ratelimiter.InputOutService;

@RestController 
@RequestMapping("/hello")
public class ControllerTest {
	
	
	@Autowired
	InputOutService inputOut;
	//@GetMapping("/hello")
	@GetMapping
	public String get() {
		return "hello world";

	}

	@PostMapping
	public ResponseEntity<List<InOutDto>> outPutResponse(@RequestBody InOutDto out ) {
		return   inputOut.getResponseId(out);

	}

}
