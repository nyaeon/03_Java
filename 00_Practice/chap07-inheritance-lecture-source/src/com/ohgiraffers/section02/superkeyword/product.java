package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class product{

    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    // 기본 생성자
    public product() {
        /*
        아무 클래스도 상속받지 않았는데 super()가 호출이 된다.
        java.lang.Object 클래스의 생성자를 호출하게 된다.
        이유는 몰든 클래스는 Object 클래스의 후손이기 때문이다.
         */
        super();
        System.out.println("Product 클래스의 기본 생성자 호출함...");
    }

    public product(String code, String brand, String name, int price, Date manufacturingDate) {

        super();
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product 클래스의 매개변수 있는 생성자 호출");
    }

    public String getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    // 오버로딩된 생성자 (삼성, 갤럭시 폴드용)
    public product(String code, String brand, String name) {
        this(code, brand, name, 0, new Date()); // 기본 가격 0, 현재 날짜로 설정
    }

    public String getInformation() {
        return "code: " + code + ", brand: " + brand + ", name: " + name +
                ", price: " + price + ", manufacturingDate: " + manufacturingDate;
    }
}
