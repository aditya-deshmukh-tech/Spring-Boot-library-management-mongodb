package com.library.management.LibraryManagement.security;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document
public class UserClient implements Serializable {

    @Id
    private String username;
    private String password;
    private List<String> roles;

    public UserClient(String username, String password, List<String> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public UserClient() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
