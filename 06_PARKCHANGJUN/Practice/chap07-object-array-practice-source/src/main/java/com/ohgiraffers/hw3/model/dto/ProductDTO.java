package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {

    private int pld; // 제품번호
    private String pName; // 제품명
    private int price; // 제품 가격
    private double tax; // 제품 세금

    public ProductDTO() {}

    public ProductDTO(int pld, String pName, int price, double tax) {
        this.pld = pld;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information() {

        return ("pld = " + pld
                + ", pName = " + pName
                + ", price = " + price
                + ", tax = " + tax);
    }
}
