package com.jfilippo.user.register.model;

import java.math.BigInteger;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private BigInteger id;
	@NotBlank(message = "Name is mandatory")
	private String fullName;
	private String gender;
	@Email
	@NotBlank(message = "email is mandatory")
	private String email;
	@DateTimeFormat
	@NotBlank(message = "birthday Date is mandatory")
	private Instant birthdayDate;
	private String nationality;
	@Pattern(regexp = "(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)")
	private String cpf;
	
}
