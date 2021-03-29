package com.example.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

import com.example.bookstore.Model.*;
public interface CmtRepository extends JpaRepository<Cmt, Integer> {
    public Iterable<Cmt> findByBookid(Integer bookid);
}
