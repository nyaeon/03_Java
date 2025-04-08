package com.ohgiraffers.section04.test;

public class Anibook extends Book {
    public int accessAge;

    public Anibook() {
    }

    public Anibook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return super.toString() +
                "accessAge=" + accessAge;
    }
}
