package com.ohgiraffers.hw1.model.dto;

public class CookBook extends Book { // Book 클래스로부터 상속을 받음.

    private boolean coupon; // 요리학원쿠폰유무

    public CookBook() {
        super();
    } // 기본생성자 생성

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher); // 부모 클래스(Book)의 생성자 호출
        this.coupon = coupon; // 자기 자신 필드 초기화.
    }

    // getter, setter
    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + coupon;
    }
}