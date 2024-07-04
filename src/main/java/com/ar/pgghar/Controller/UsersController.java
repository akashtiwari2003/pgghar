package com.ar.pgghar.Controller;


import com.ar.pgghar.entity.Users;
import com.ar.pgghar.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/getall")
    public List<Users> getAllUsers(){
     return usersService.findAll();
    }

    @GetMapping("/login"){

    }
}
