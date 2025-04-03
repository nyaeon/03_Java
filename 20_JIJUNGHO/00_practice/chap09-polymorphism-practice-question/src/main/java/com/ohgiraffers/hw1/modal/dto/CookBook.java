package com.ohgiraffers.hw1.modal.dto;

public class CookBook extends Book {

    private boolean coupon;

    public void CookBook() {}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    public String toString() {
        return this.title + " / " + this.author + " / " + this.publisher + " / " + this.coupon;
    }
}
