package com.ohgiraffers.hw1.model.dto;

public class Book {

    private String title; // 도서명
    private String author; // 저자명
    private String publisher; // 출판사명

    public Book() {}

    public Book(String publisher, String author, String title) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    //getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return this.title + " / " + this.author + " / " + this.publisher;
    }
}
