package com.shush.mainPackge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shush.mainPackge.entity.Author;
import com.shush.mainPackge.repository.AuthorRepository;

@RestController
@RequestMapping
public class AutorController {
	@Autowired
	AuthorRepository repo;
	//create test method...
	
	@GetMapping("test")
	public String test() {
		return "Application is working fine";
	}
	
	@PostMapping("addauthor")
	public Author addAuthor(@RequestBody Author author){
		return repo.save(author);
	}
	
	@GetMapping("getallauthor")
	@CrossOrigin(origins = "http://localhost:8080")
	public List<Author>getAllAuthor( @RequestBody Author author){
		return repo.findAll();
	}

}//class...
