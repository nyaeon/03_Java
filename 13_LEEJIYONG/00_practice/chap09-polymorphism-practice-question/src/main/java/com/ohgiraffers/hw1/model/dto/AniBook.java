package com.ohgiraffers.hw1.model.dto;

public class AniBook extends Book {

    private int accessAge;

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return title + " / " + author + " / " + publisher + " / " + accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
}
