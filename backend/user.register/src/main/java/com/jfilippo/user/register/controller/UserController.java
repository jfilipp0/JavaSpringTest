package com.jfilippo.user.register.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfilippo.user.register.model.User;
import com.jfilippo.user.register.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
	private UserService userService;
	
	@PostMapping
	public String  create(@RequestBody User user ) {
		userService.save(user);
		
		return "User " + user.getFullName() + " your Registration process successfully completed";
	}
	
	@GetMapping("{email}")
	public Optional<User> getByEmail(@PathVariable String email){
		return userService.getByEmail(email);
	}
	
}
