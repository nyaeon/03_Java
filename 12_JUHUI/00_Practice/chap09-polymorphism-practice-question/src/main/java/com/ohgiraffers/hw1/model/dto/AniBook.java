package com.ohgiraffers.hw1.model.dto;

public class AniBook extends Book {

    private int accessAge; // 제한 나이

    public AniBook() {}

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(publisher, author, title);
        this.accessAge = accessAge;
    }

    //getter
    public int getAccessAge() {
        return accessAge;
    }

    //setter
    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return this.getTitle() + " / " + this.getAuthor() + " / " + this.getPublisher() + " / " + this.getAccessAge();
    }
}
