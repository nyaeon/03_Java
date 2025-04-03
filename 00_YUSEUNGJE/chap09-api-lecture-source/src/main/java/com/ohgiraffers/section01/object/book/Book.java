package com.ohgiraffers.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    // 기본생성자
    public Book() {
    }
    
    // 모든 필드를 초기화하는 생성자
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 1. toString 오버라이딩

    @Override
    public String toString() {
        return "[" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ']';
    }
}
