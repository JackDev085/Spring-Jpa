package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.sevices.UserService;

//Identificando que é um controlador rest 
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//anotação identificando que é uma dependência
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>>findAll(){
		List<User>list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	//anotação para dizer que será uma requisição do tipo "GET"
	@GetMapping(value = "/{id}")
	//anotação para que o framework aceite o parametro para encontrar o id
	public ResponseEntity<User>findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
