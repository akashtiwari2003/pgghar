package com.ar.pgghar.services;

import com.ar.pgghar.DTO.SignUpRequestDTO;
import com.ar.pgghar.entity.Users;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsersService {
    List<Users> findAll();
    Users findByUserIdAndPassword(int userId, String password);

    ResponseEntity<String> createUser(SignUpRequestDTO signUpRequestDTO);

    void deleteByUserId(int userId);
}
