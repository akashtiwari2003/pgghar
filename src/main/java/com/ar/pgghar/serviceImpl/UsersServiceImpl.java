package com.ar.pgghar.serviceImpl;


import com.ar.pgghar.DTO.SignUpRequestDTO;
import com.ar.pgghar.entity.Users;
import com.ar.pgghar.repository.UsersRepository;
import com.ar.pgghar.services.UsersService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;


    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users findByUserIdAndPassword(int userId, String password) {
        return usersRepository.findByUserIdAndPassword(userId,password);
    }

    @Override
    public ResponseEntity<String> createUser(SignUpRequestDTO signUpRequestDTO) {
        Users users= new Users(signUpRequestDTO.getName(),signUpRequestDTO.getPassword(),signUpRequestDTO.getEmail(),signUpRequestDTO.getPhone(),signUpRequestDTO.getUserType());
        usersRepository.save(users);
        return ResponseEntity.ok("User created successfully");
    }

    @Override
    public void deleteByUserId(int userId) {
        usersRepository.deleteByUserId(userId);
    }

}
