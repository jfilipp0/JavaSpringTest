package com.jfilippo.user.register.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfilippo.user.register.dto.LoginRequest;
import com.jfilippo.user.register.dto.RegisterRequest;
import com.jfilippo.user.register.model.AuthenticationBean;
import com.jfilippo.user.register.service.AuthService;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class BasicAuthController {
	
	private final AuthService authService;
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean basicAuth() {
		return new AuthenticationBean(" you re authenticated");
	}
	
	@PostMapping("signup")
	public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
		authService.signup(registerRequest);
		return new ResponseEntity<>("User registration Successful", HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public void login(@RequestBody LoginRequest loginRequest) {
		authService.login(loginRequest);
	}
	
}
