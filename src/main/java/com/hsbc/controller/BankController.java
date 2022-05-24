package com.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.entity.Bank;
import com.hsbc.repository.BankRepository;
import com.hsbc.services.BankService;
@RestController
@RequestMapping("/bank")
public class BankController {
@Autowired
BankService bankService;

@Autowired
BankRepository bankRepository;

	@GetMapping("/getbank")
	public List<Bank> getdata()
	{	
		List<Bank> banklist = (List<Bank>) bankRepository.findAll();
		return banklist;	
	}
	
	@PostMapping("/savedata")
	public void setdata(@RequestBody Bank bank)
	{
	bankService.savedata(bank);  
		//return bank.getLoc();  
		
	}
	
}
