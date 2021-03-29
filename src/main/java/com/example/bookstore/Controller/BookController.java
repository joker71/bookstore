package com.example.bookstore.Controller;

import java.util.Map;
import java.util.Optional;

import com.example.bookstore.Exception.ResourceNotFoundException;
import com.example.bookstore.Model.Book;
import com.example.bookstore.Service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class BookController {
    @Autowired
    BookService bookService;
    public BookController(BookService bookService)
    {
        this.bookService= bookService;
    }
    @GetMapping("/")
    public Iterable<Book> getAllBook()
    {
        return this.bookService.getBook();
    }
    @GetMapping("/books/{id}")
    public Optional<Book> getBookById(@PathVariable("id") Integer id)
    {
        return this.bookService.getBook(id);
    }
    @DeleteMapping("/books/{id}")
    public Map<String, Boolean> deleteBookById(@PathVariable(value="id") Integer bookid) throws ResourceNotFoundException
    {
        return this.bookService.deleteBook(bookid);
    }
    @PostMapping(value="/books/")
    public HttpStatus postBook(@RequestBody Book entity) {
        this.bookService.addBook(entity);
        return HttpStatus.CREATED;
    }
    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable(value = "id") Integer id , @RequestBody Book bookDetail) throws ResourceNotFoundException
    {
        Book book= this.getBookById(id).orElseThrow(()->new ResourceNotFoundException("Book not found: " + id));
        book.setAuthor(bookDetail.getAuthor());
        book.setBookname(bookDetail.getBookname());
        book.setDes(bookDetail.getDes());
        book.setImg(bookDetail.getImg());
        book.setNopage(bookDetail.getNopage());
        book.setNxb(bookDetail.getNxb());
        book.setPrice(bookDetail.getPrice());
        book.setPrice(bookDetail.getPrice());

        final  var updateBook= this.bookService.addBook(book);
        return  ResponseEntity.ok(updateBook);
    }    
}
