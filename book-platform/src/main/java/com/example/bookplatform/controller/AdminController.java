package com.example.bookplatform.controller;

import com.example.bookplatform.model.Book;
import com.example.bookplatform.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book createdBook = adminService.addBook(book);
        return ResponseEntity.ok(createdBook);
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book updatedBook = adminService.updateBook(id, book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        adminService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/reports/top-rated")
    public ResponseEntity<List<Book>> getTopRatedBooks() {
        List<Book> topRatedBooks = adminService.getTopRatedBooks();
        return ResponseEntity.ok(topRatedBooks);
    }

    @GetMapping("/reports/active-users")
    public ResponseEntity<List<String>> getActiveUsers() {
        List<String> activeUsers = adminService.getActiveUsers();
        return ResponseEntity.ok(activeUsers);
    }
}