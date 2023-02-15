package com.sindalah.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/api/v1/log4j" })
public class Log4jController {

	private static final Logger logger = LoggerFactory.getLogger(Log4jController.class);

	@GetMapping
	@ResponseBody
	String login() {

		logger.trace("This is a trace log example");
		logger.info("This is an info log example");
		logger.debug("This is a debug log example");
		logger.error("This is an error log example");
		logger.warn("This is a warn log example");

		return "Log4j dogger loaded!!!";
	}

}
