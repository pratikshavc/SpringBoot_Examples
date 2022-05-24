package com.hsbc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hsbc.entity.Bank;

public interface BankRepository extends CrudRepository<Bank, Integer> {

	List<Bank> findAll();


}
