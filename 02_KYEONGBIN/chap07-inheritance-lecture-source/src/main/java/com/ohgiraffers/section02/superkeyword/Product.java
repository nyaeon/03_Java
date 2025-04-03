package com.ohgiraffers.section02.superkeyword;

import java.util.Date; // 📅 날짜 관련 기능을 사용하기 위해 추가

// 🏭 상품(Product) 클래스 정의
public class Product {

    // 🔖 상품의 속성(필드)
    private String code;              // 상품 코드 (예: "P001")
    private String brand;             // 제조사 (예: "Samsung")
    private String name;              // 상품명 (예: "Galaxy S24")
    private int price;                // 가격 (예: 1,200,000 원)
    private Date manufacturingDate;   // 📅 제조일자 (예: 2024-03-25)

    // 🏗️ 기본 생성자 (객체 생성 시 자동 실행)
    public Product() {
        System.out.println("Product 클래스의 기본생성자 호출됨...");
    }
}
