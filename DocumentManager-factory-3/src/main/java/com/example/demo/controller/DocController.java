package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.Factory;
import com.example.demo.service.DocumentService;

@RestController
public class DocController {
@GetMapping("Print/{type}")
	public String getDocument(@PathVariable String type){
	DocumentService ds = Factory.getObject(type);
	return ds.printDocument();
	
}
}
