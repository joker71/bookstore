package com.example.bookstore.Service;

import java.util.Optional;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Repository.BookRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookService {
    BookRepository bookRepository;
    public BookService (BookRepository bookRepository){
        this.bookRepository= bookRepository;
    }

    @GetMapping("/")
    public Iterable<Book> getBook()
    {
        return this.bookRepository.findAll();
    }
    
    @GetMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable("id") Integer id)
    {
        return this.bookRepository.findById(id);
    }

    @PostMapping("/books/")
    public HttpStatus addBook(@RequestBody Book newBook)
    {
        this.bookRepository.save(newBook);
        return HttpStatus.CREATED;
    }

}
