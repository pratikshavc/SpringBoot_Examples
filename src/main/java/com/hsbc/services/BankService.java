package com.hsbc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.entity.Bank;
import com.hsbc.repository.BankRepository;
@Service
public class BankService {
	@Autowired
	BankRepository bankRepository;
	
	
	public String savedata(Bank bank)   
	{  
	bankRepository.save(bank);
	return "data saved";  
	}  
}
