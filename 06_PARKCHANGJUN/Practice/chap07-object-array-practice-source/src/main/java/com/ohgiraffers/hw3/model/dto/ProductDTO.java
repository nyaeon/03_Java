package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {

    private int pld;        // 제품 번호
    private String pName;   // 제품명
    private int price;      // 제품 가격
    private double tax;     // 제품 세금

    public ProductDTO() {
    }

    public ProductDTO(int pld, String pName, int price, double tax) {
        this.pld = pld;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public int getPld() {
        return pld;
    }

    public void setPld(int pld) {
        this.pld = pld;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String information() {
        return "제품번호 = " + pld +
                ", 제품명 = " + pName +
                ", 제품 가격 = " + price +
                ", 제품 세금 = " + tax;
    }
}
