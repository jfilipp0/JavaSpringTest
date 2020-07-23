package com.jfilippo.user.register.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jfilippo.user.register.model.User;
import com.jfilippo.user.register.repository.UserRepository;
import com.jfilippo.user.register.utils.ParameterAlreadyInUseException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	
	private UserRepository userRepository;
	
	public void save(User user) {
        validateNewPerson(user.getCpf());
        userRepository.save(user);
    }
	
	public Optional<User> getByEmail(String email){
		return userRepository.findByEmail(email);
	}
	
	private void validateNewPerson(String newIncoming) {
		
		userRepository.findByCpf(newIncoming).ifPresent(person -> {
            throw new ParameterAlreadyInUseException(person.getCpf());
        });
		
    }
}
