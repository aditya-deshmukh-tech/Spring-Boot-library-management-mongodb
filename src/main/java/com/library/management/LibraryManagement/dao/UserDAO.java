package com.library.management.LibraryManagement.dao;

import com.library.management.LibraryManagement.repository.UserRepository;
import com.library.management.LibraryManagement.security.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDAO {

    private UserRepository repository;

    public Optional<UserClient> getUser(String username) {
        return repository.findById(username);
    }

    public boolean existsById(String username) {
        return repository.existsById(username);
    }

    public void save(UserClient userClient) {
        repository.save(userClient);
    }

    public void update(UserClient userClient) {
        repository.save(userClient);
    }

    public void deleteUser(String username) {
        repository.deleteById(username);
    }

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }
}
