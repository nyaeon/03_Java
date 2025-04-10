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
        /*
        * 아무 클래스도 상속받지 않았는데 super()가 호출이된다.
        * java.lang.Object클래스의 생성자를 호출하게 된다.
        * 이유는 모든 클래스는 Object 클래스의 후손이기 때문이다.
        * */
        super();
        System.out.println("Product클래스의 기본생성자 호출함...");
    }

    public Product(String code, String brand, String name, int price, Date manufacturingDate) {

        super();
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product클래스의 매개변수 있는 생성자 호출....");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInformation() {

        return "code = " + this.code
                + ", brand = " + this.brand
                + ", name = " + this.name
                + ", price = " + this.price
                + ", manufacturingDate = " + this.manufacturingDate;

    }
}
