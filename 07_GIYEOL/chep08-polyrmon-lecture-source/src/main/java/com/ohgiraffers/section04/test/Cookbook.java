package com.ohgiraffers.section04.test;

public class Cookbook extends Book {

    private boolean coupon;
    public Cookbook() {

    }

    public Cookbook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "쿠폰 = " + coupon;
    }
}
