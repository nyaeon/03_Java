package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {
    private int pld;
    private  String pName;
    private  int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(double tax, int price, String pName, int pld) {
        this.tax = tax;
        this.price = price;
        this.pName = pName;
        this.pld = pld;
    }

    public int getPld() {
        return pld;
    }

    public String getName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public void setPld(int pld) {
        this.pld = pld;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String Information(){
        return "제품 번호 : " + pld
                + "제품 이름 : " + pName
                + "제품 가격 : " + price
                + "제품 세금 : " + tax;

    }
}
