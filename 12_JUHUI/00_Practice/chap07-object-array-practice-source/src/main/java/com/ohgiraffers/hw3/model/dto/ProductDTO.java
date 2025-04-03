package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {

    private int pid; // 제품 번호
    private String pName; // 제품명
    private int price; // 제품 가격
    private double tax; // 제품 세금

    // 기본 생성자
    public ProductDTO() {}

    public ProductDTO(int pid, String pName, int price, double tax) {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    //ProductDTO 클래스의 필드는 private으로 선언되어 있어, 외부에서 필드에 직접 접근할 수 없음.
    // 필드 값을 읽고 수정하기 위해 getter, setter 메서드가 필요하기 때문에 추가.

    //setter
    public void setPid(int pid) {
        this.pid = pid;
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

    // getter

    public int getPid() {
        return pid;
    }

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

    public String information() {
        return " pid: " + pid
                + ", pName: " + pName
                + ", price: " + price
                + ", tax: " + tax;
    }
}
