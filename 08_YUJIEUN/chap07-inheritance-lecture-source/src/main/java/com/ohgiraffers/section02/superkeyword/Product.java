package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code;              // 상품코드
    private String brand;             // 제조사
    private String name;              // 상품명
    private int price;                // 가격
    private Date manufacturingDate;   // 제조일자

    // 기본생성자
    public Product() {
        System.out.println("Product클래스의 기본생성자 호출함...");
    }
}