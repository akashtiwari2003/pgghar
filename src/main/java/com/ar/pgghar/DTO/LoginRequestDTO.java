package com.ar.pgghar.DTO;

public class LoginRequestDTO {
    private int userId;
    private String password;

    public LoginRequestDTO() {
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public LoginRequestDTO(int userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}

