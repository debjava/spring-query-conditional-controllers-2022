package com.ddlab.rnd.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.rnd.entity.OrderEntity;

@RestController
@RequestMapping(path = "/command")
//@ConditionalOnProperty(prefix = "command", name= "enabled",havingValue = "true", matchIfMissing = true)
@ConditionalOnProperty(prefix = "command", name= "enabled",havingValue = "true")
public class CommandController {
	
	@PostMapping("/order")
	public ResponseEntity<String> createOrder(OrderEntity order) {
		System.out.println("Order: "+order);
		return new ResponseEntity<String>("Order created ...", HttpStatus.CREATED);
	}
}
