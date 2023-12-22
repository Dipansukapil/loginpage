package com.example.login.service;

import com.example.login.model.User;
import com.example.login.web.dto.UserRegistrationDto;

public interface UserService {
	
	
	User save(UserRegistrationDto userRegistrationDto);

}
