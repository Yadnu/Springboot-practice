package com.yadneya.restful_web_services.users;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserResource {
	private UserDaoService service;
	public UserResource(UserDaoService service) {
		this.service = service;
	}
	// GET /users
	@GetMapping(path = "/users" )
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}
	// GET oneuser /users
	@GetMapping("/users/{id}")
	public User retrieveOneUser(@PathVariable Integer id ) {
		return service.findOne(id);
	}
}
