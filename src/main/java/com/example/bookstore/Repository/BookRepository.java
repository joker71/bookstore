package com.example.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookstore.Model.*;
public interface BookRepository extends JpaRepository<Book, Integer>
{
}