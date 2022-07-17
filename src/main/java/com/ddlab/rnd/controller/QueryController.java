package com.ddlab.rnd.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/query")
//@ConditionalOnProperty(prefix = "command.query", name= "commandQuery", havingValue = "false")
@ConditionalOnProperty(prefix = "query", name= "enabled",havingValue = "true")
public class QueryController {

	@GetMapping("/order/{id}")
	public ResponseEntity<String> createOrder(@PathVariable("id") long id) {
		System.out.println("Order Id: " + id);
		return new ResponseEntity<String>("Order Info ...", HttpStatus.OK);
	}

}
