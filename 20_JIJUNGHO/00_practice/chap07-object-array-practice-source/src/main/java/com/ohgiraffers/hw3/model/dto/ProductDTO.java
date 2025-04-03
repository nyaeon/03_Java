package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {

    private int pId;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(int pId, String pName, int pPrice, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = pPrice;
        this.tax = tax;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int pPrice) {
        this.price = pPrice;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String infomation() {
        return "제품번호 = " + this.pId + ", "
                + "제품명 = " + this.pName + ", " +
                "가격 = " + this.price + ", " + "세금 = " + this.tax;
    }
}
