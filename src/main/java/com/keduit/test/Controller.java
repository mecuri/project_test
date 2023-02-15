package com.keduit.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@org.springframework.stereotype.Controller
@RequestMapping("/")
@Log4j2
@RequiredArgsConstructor
public class Controller {

	@GetMapping({"/checkbox", "/mail", "/weather"})
	public void checkbox() {
		
	}
	
}
