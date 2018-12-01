package com.example;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sample112301Application {
	
	//获取log4j
	private static Logger logger=LoggerFactory.getLogger(Sample112301Application.class);
	
	//日志
	@PostConstruct//在初始化时执行，只执行一次
	public void logSomething() {
		//根据指定的显示级别，打印信息
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.trace("trace");
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample112301Application.class, args);
	}
}
