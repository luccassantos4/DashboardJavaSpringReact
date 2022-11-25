package com.github.luccassantos4.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.luccassantos4.dsmeta.entities.Sale;
import com.github.luccassantos4.dsmeta.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	
	public List<Sale>findSales() {
		return repository.findAll();
	}
}
