package com.jfilippo.user.register.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jfilippo.user.register.dto.LoginRequest;
import com.jfilippo.user.register.dto.RegisterRequest;
import com.jfilippo.user.register.model.User;
import com.jfilippo.user.register.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class AuthService {
	
	
	private final PasswordEncoder password;
	private final UserRepository userRepository;
	private final AuthenticationManager authenticationManager;
	
	
	public void signup(RegisterRequest reg) {
		
		User user = new User();
		user.setEmail(reg.getEmail());
		user.setUsername(reg.getUsername());
		user.setPassword(password.encode(reg.getPassword()));
		user.setFullName(reg.getFullName());
		user.setGender(reg.getGender());
		user.setBirthdayDate(reg.getBirthdayDate());
		user.setNationality(reg.getNationality());
		user.setCpf(reg.getCpf());
		
		userRepository.save(user);
	}


	public void login(LoginRequest loginRequest) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), 
				loginRequest.getPassword()));
		
	}

}
