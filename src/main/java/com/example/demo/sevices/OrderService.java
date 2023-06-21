package com.example.demo.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;
import com.example.demo.repositories.OrderRepository;

//registra um serviço na área de serviço
@Service
public class OrderService {
	//injeção de dependência
	@Autowired
	private OrderRepository repository;
	
	public List<Order>findAll(){
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order>obj=repository.findById(id);
		return obj.get();
	}
}

