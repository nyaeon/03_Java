package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    private String title;
    private String author;
    private String publisher;
    private int price;
    private double discountRate;


    public BookDTO() {

    }

    public BookDTO(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public BookDTO(String title, String author, String publisher, int price, double discountRate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.discountRate = discountRate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("title : " + title);
    }

    public void setAuthor(String author) {
        this.author = author;
        System.out.println("author : "+author);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
        System.out.println("publisher : "+publisher);
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("price : "+price);
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
        System.out.println("discountRate : "+discountRate);
    }

    public void printInformation(){
        System.out.println("title : "+ this.title  + ", publisher :  " +  this.publisher + ", author : "
               + this.author+ ", price :  "+ this.price + ", discountRate : " + this.discountRate);

    }
}

