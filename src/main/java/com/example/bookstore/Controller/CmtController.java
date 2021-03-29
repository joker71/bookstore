package com.example.bookstore.Controller;


import com.example.bookstore.Model.Cmt;
import com.example.bookstore.Service.CmtService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CmtController {
    CmtService cmtService;
    public CmtController(CmtService cmtService)
    {
        this.cmtService= cmtService;
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/cmts")
    public Iterable<Cmt> getAllCmt()
    {
        return this.cmtService.getCmt();
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/cmts/{bookid}")
    public Iterable<Cmt> getCmtWithBookid(@PathVariable("bookid") Integer bookid)
    {
        return this.cmtService.getCmtID(bookid);
    }
    @CrossOrigin("http://localhost:4200")
    @PostMapping(value = "/cmts/")
    public HttpStatus postCmt(@RequestBody Cmt entity)
    {
         this.cmtService.addCmt(entity);
         return HttpStatus.CREATED;
    }
}
