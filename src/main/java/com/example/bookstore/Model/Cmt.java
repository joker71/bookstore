package com.example.bookstore.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cmt")
public class Cmt{
 @Id
 @Column(name = "cmtid")
 private String cmtid;
 private String userid;
 private int bookid;
 private String content;
 private int cmtdec;


    public Cmt() {
    }

    public Cmt(String cmtid, String userid, int bookid, String content, int cmtdec) {
        this.cmtid = cmtid;
        this.userid = userid;
        this.bookid = bookid;
        this.content = content;
        this.cmtdec = cmtdec;
    }

    public String getCmtid() {
        return this.cmtid;
    }

    public void setCmtid(String cmtid) {
        this.cmtid = cmtid;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getBookid() {
        return this.bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCmtdec() {
        return this.cmtdec;
    }

    public void setCmtdec(int cmtdec) {
        this.cmtdec = cmtdec;
    }
 
}
