package com.example.login.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.model.Role;
import com.example.login.model.User;
import com.example.login.repository.UserRepository;
import com.example.login.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto userRegistrationDto) {
		
		User user = new User(userRegistrationDto.getFirstName(),
				             userRegistrationDto.getLastName(),
				             userRegistrationDto.getEmail(),
				             userRegistrationDto.getPassword(),
				             Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}

}
