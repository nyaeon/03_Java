package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {
    private int pld;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(int pld, String pName, int price, double tax) {
        this.pld = pld;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }
    public String information(){
        return "제품 번호 : " + pld +"  제품명 : "+pName+"  제품 가격 : "+price+"  제품 세금 : "+tax;
    }
}
