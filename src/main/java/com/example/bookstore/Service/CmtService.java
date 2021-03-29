package com.example.bookstore.Service;



import com.example.bookstore.Model.Cmt;
import com.example.bookstore.Repository.CmtRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;



@Service

public class CmtService {
    /**
     *
     */
    
    @Autowired
    CmtRepository cmtRepository;
    public CmtService(CmtRepository cmtRepository)
    {
        this.cmtRepository= cmtRepository;
    }

    public Iterable<Cmt> getCmt()
    {
        return this.cmtRepository.findAll();
    }
    
    public Iterable<Cmt> getCmtID(Integer bookid)
    {
        return this.cmtRepository.findByBookid(bookid);
    }
    
    public Cmt addCmt (Cmt entity) 
    {
        return this.cmtRepository.save(entity);
    }
    
}
