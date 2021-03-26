package com.example.bookstore.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "userid")
    private String userid;
    private String pass;
    private String username;
    private String email;
    private int userage;

    public Users() {
    }

    public Users(String userid, String pass, String username, String email, int userage) {
        this.userid = userid;
        this.pass = pass;
        this.username = username;
        this.email = email;
        this.userage = userage;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserage() {
        return this.userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }
    

}