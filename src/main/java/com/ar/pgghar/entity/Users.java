package com.ar.pgghar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    public Users(String name, String password, String email, String phone, String type) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.type = type;
    }

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "user_type")
    private String type;

    public Users() {
    }

    public Users(int user_id, String name, String password, String email, String phone, String type) {
        this.userId = user_id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.type = type;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
