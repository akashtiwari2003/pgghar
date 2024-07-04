package com.ar.pgghar.Controller;


import com.ar.pgghar.DTO.LoginRequestDTO;
import com.ar.pgghar.DTO.SignUpRequestDTO;
import com.ar.pgghar.entity.Users;
import com.ar.pgghar.services.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/getall")
    public List<Users> getAllUsers(){
     return usersService.findAll();
    }

    @GetMapping("/login")
    public Users login(@RequestBody LoginRequestDTO loginRequestDTO){
        return usersService.findByUserIdAndPassword(loginRequestDTO.getUserId(),loginRequestDTO.getPassword());
    }
    @PostMapping("/signup")
    public ResponseEntity<String> createUser(@RequestBody SignUpRequestDTO signUpRequestDTO){
        return usersService.createUser(signUpRequestDTO);
    }
    @DeleteMapping("/delete/{userId}")
    public void deleteByUserId(@PathVariable("userId") int userId){
       usersService.deleteByUserId(userId);
    }
}
