package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Student;


@RestController
public class HelloController {

	private static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private Student stu;

	@RequestMapping("/hello")
	public String hello() {
		logger.debug(stu.toString()+"debug");
		logger.info(stu.toString()+"info");
		logger.warn(stu.toString()+"warn");
		logger.error(stu.toString()+"error");
		logger.trace(stu.toString()+"trace");
		return "hello";
	}

}
