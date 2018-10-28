package com.thilini.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thilini.demo.model.period;
import com.thilini.demo.repository.periodRepository;

@Service
public class periodServiceImpl implements periodService{

	@Autowired
	private periodRepository periodRepository;
	
	@Override
	public Iterable<period> findAllPeriod() {
		// TODO Auto-generated method stub
		return periodRepository.findAll();
	}

}