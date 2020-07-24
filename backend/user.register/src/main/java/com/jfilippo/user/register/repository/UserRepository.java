package com.jfilippo.user.register.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jfilippo.user.register.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, BigInteger> {
	
	Optional<User> findByCpf(String cpf);
	Optional<User> findByEmail(String email);
	Optional<User> findByUsername(String username);

}
