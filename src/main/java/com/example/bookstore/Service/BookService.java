package com.example.bookstore.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Repository.BookRepository;
import com.example.bookstore.Exception.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



// @RestController
// @CrossOrigin(origins = "http://localhost:4200")
@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public BookService (BookRepository bookRepository){
        this.bookRepository= bookRepository;
    }
    public Iterable<Book> getBook()
    {
        return this.bookRepository.findAll();
    }
    
    
    public Optional<Book> getBook(Integer id)
    {
        return this.bookRepository.findById(id);
    }

    public Book  addBook(Book newBook)
    {
        
        return this.bookRepository.save(newBook);
    }

    // @DeleteMapping("/books/{id}")
    public Map<String, Boolean> deleteBook(  Integer bookid) throws ResourceNotFoundException
    {
         Book book= bookRepository.findById(bookid).orElseThrow(() ->new ResourceNotFoundException("book id is not found: " + bookid));
        this.bookRepository.delete(book);
        Map<String, Boolean> response= new HashMap<>();
        response.put("delete", Boolean.TRUE);
        return response;
    }

}
