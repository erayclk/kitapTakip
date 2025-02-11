package com.example.bookplatform.service;

import com.example.bookplatform.model.Book;
import com.example.bookplatform.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setCategory(bookDetails.getCategory());
        book.setRating(bookDetails.getRating());
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        bookRepository.delete(book);
    }

    public List<Book> getTopRatedBooks() {
        return bookRepository.findTop5ByOrderByRatingDesc();
    }

    public List<String> getActiveUsersReport() {
        // Implementation for generating active users report
        return null; // Placeholder for actual implementation
    }
}