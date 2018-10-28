package com.thilini.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thilini.demo.model.period;
import com.thilini.demo.service.periodService;
@RestController
public class periodController {

	@Autowired
	private periodService periodService;
	
	@GetMapping("/period")
	public Iterable<period> findAllPeriod(){
		
		return periodService.findAllPeriod();
	}
}