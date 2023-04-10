package com.example.demomongodb.controller;

import com.example.demomongodb.dao.BookRepo;
import com.example.demomongodb.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepo bookRepo;

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book savedBook = bookRepo.save(book);
        return ResponseEntity.status(CREATED).body(savedBook);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookRepo.findAll());
    }
}
