package com.service;

import com.dto.UserDTO;
import com.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserDTO userDTO);

    UserDetails loadUserById(int userId);
}
