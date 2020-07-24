package com.jfilippo.user.register.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
	
	private String email;
    private String username;
    private String password;
    private String fullName;
	private String gender;
	private Instant birthdayDate;
	private String nationality;
	private String cpf;
	
}
