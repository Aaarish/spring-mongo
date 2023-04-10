package com.example.demomongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
    private int bookId;
    private String title;
    private int pages;
    private int price;


    public Book(int bookId, String title, int pages, int price) {
        this.bookId = bookId;
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
