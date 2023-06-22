package com.example.demo.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

//registra um serviço na área de serviço
@Service
public class CategoryService {
	//injeção de dependência
	@Autowired
	private CategoryRepository repository;
	
	public List<Category>findAll(){
		return repository.findAll();
	}
	public Category findById(Long id) {
		Optional<Category>obj=repository.findById(id);
		return obj.get();
	}
}

