package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody UserDto userDto) {
        User user = new User();
        user.setName(userDto.name());

        userRepository.save(user);

        return ResponseEntity.ok("ok");
    }

    @GetMapping
    public ResponseEntity<List<User>> get() {
        List<User> users = userRepository.findAll();

        return ResponseEntity.ok(users);
    }
}
