 package com.sindalah.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping({ "/api/v1/slf4j" })
public class Slf4jController {
	
	@GetMapping
	@ResponseBody
	String login() {
		log.info("Slf4j logger loaded!!!");
		return "Slf4j Logger";
	}
	

}
