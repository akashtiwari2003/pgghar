package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.entity.Users;
import com.ar.pgghar.repository.UsersRepository;
import com.ar.pgghar.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;


    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }
}
