package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MessageService;

@RestController
public class MassageController {
	
	@Autowired//注入接口，但会根据条件注入其的实现类
	private MessageService messageService;
	
	@RequestMapping("/mes")
	public String message() {
		return messageService.getMessage();
	}

}
