package com.ohgiraffers.hw1.model.dto;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }
    @Override
    public String toString() {
        return super.toString() + ", 쿠폰 유무: " + (coupon ? "있음" : "없음");
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
}
