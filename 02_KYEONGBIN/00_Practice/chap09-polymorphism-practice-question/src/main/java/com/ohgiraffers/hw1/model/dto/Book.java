package com.ohgiraffers.hw1.model.dto;

public class Book {

    private String title;
    private String author;
    private String publisher;

    public Book() {}
    public Book(String title, String author, String publisher) {}

    @Override
    public String toString() {
        return Book.class.getSimpleName()
                + " [title=" + title
                + ", author=" + author
                + ", publisher=" + publisher
                + "]";
    }

    public String getTitle() {

    return title;}

}
