package com.example.bookplatform.controller;

import com.example.bookplatform.model.User;
import com.example.bookplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        String token = userService.loginUser(user);
        return ResponseEntity.ok(token);
    }

    @GetMapping("/favorites")
    public ResponseEntity<?> getFavoriteBooks(@RequestParam Long userId) {
        return ResponseEntity.ok(userService.getFavoriteBooks(userId));
    }

    @PostMapping("/favorites")
    public ResponseEntity<?> addFavoriteBook(@RequestParam Long userId, @RequestParam Long bookId) {
        userService.addFavoriteBook(userId, bookId);
        return ResponseEntity.ok("Book added to favorites");
    }

    @DeleteMapping("/favorites")
    public ResponseEntity<?> removeFavoriteBook(@RequestParam Long userId, @RequestParam Long bookId) {
        userService.removeFavoriteBook(userId, bookId);
        return ResponseEntity.ok("Book removed from favorites");
    }
}