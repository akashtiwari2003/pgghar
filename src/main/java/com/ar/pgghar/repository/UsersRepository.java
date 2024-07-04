package com.ar.pgghar.repository;


import com.ar.pgghar.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findAll();
    Users findByUserIdAndPassword(int userId, String password);
    void deleteByUserId(int userId);

}
