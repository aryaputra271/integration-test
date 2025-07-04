package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User, Long> {
    void save(User user);

    List<User> findAll();
}
