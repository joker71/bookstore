package com.example.bookstore.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "book")
public class Book 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookid")
    private Integer bookid ;
    private String bookname ;
    private String img ;
    private String author; 
    private int price;
    private String nxb;
    private int yearxb;
    private int nopage;
    private String des;
    private int norating;
    private int rating;
    public Book()
    {

    }
    public Integer getBookid() {
        return this.bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return this.bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNxb() {
        return this.nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getYearxb() {
        return this.yearxb;
    }

    public void setYearxb(int yearxb) {
        this.yearxb = yearxb;
    }

    public int getNopage() {
        return this.nopage;
    }

    public void setNopage(int nopage) {
        this.nopage = nopage;
    }

    public String getDes() {
        return this.des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getNorating() {
        return this.norating;
    }

    public void setNorating(int norating) {
        this.norating = norating;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Book(Integer bookid, String bookname, String img, String author, int price, String nxb, int yearxb, int nopage, String des, int norating, int rating) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.img = img;
        this.author = author;
        this.price = price;
        this.nxb = nxb;
        this.yearxb = yearxb;
        this.nopage = nopage;
        this.des = des;
        this.norating = norating;
        this.rating = rating;
    }
}
