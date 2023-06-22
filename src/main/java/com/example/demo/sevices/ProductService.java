package com.example.demo.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

//registra um serviço na área de serviço
@Service
public class ProductService {
	//injeção de dependência
	@Autowired
	private ProductRepository repository;
	
	public List<Product>findAll(){
		return repository.findAll();
	}
	public Product findById(Long id) {
		Optional<Product>obj=repository.findById(id);
		return obj.get();
	}
}

