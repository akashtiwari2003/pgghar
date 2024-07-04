package com.ar.pgghar.DTO;

public class SignUpRequestDTO {
    private int userId;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String userType;

    public SignUpRequestDTO() {
    }

    public int getUserId() {
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public SignUpRequestDTO(String name, String password, String email, String phone, String userType) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.userType = userType;
    }
}
