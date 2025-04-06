package com.ohgiraffers.hw1.model.dto;

public class CookBook extends Book{
    private boolean Coupon;

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
    }

    public boolean isCoupon() {
        return Coupon;
    }

    public void setCoupon(boolean coupon) {
        Coupon = coupon;
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "Coupon=" + Coupon +
                '}';
    }

}
