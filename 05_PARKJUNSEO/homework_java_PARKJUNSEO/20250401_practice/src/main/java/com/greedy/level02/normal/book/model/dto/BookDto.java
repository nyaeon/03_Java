package com.greedy.level02.normal.book.model.dto;

public class BookDto {

    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    // 기본 생성자
    public BookDto() {
    }

    // 필드 3가지를 초기화하는 생성자
    public BookDto(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    // 모든 필드를 초기화하는 생성자

    public BookDto(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    BookDto bd = new BookDto();
    public void printInformation () {
        System.out.println(bd.title + ", " + bd.publisher + ", " + bd.author + ", "+ bd.price + ", " + bd.discountRate);
    }
}
