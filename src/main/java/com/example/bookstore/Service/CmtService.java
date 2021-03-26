package com.example.bookstore.Service;



import com.example.bookstore.Model.Cmt;
import com.example.bookstore.Repository.CmtRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins= "http://localhost:4200/")
public class CmtService {
    @Autowired
    CmtRepository cmtRepository;
    public CmtService(CmtRepository cmtRepository)
    {
        this.cmtRepository= cmtRepository;
    }
    @GetMapping("/cmt")
    public Iterable<Cmt> getCmt()
    {
        return this.cmtRepository.findAll();
    }
    @GetMapping("/cmt/{bookid}")
    public Iterable<Cmt> getCmtID(@PathVariable("bookid") Integer bookid)
    {
        return this.cmtRepository.findByBookid(bookid);
    }
    @PostMapping("/cmt/")
    public Cmt addCmt (@RequestBody Cmt entity) {
        //TODO: process POST request
        entity= this.cmtRepository.save(entity);
        return entity;
    }
    
}
