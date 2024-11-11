package com.BookStore.BookMgt_FullStack.Entity;

import jakarta.persistence.*;

@Entity
@Table(name ="My_Books")
public class MyBookList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String price;

    public MyBookList(String title, String author, String price) {
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public MyBookList() {
        super();

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
