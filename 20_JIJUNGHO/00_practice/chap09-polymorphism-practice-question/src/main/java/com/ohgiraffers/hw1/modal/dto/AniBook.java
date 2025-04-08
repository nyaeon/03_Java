package com.ohgiraffers.hw1.modal.dto;

public class AniBook extends Book {

    private int accessAge;

    public void AniBook() {}

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    public String toString() {
        return this.title + " / " + this.author + " / " + this.publisher + " / " + this.accessAge;
    }
}
