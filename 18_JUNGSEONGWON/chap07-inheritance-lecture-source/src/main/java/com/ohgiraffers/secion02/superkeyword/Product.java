package com.ohgiraffers.secion02.superkeyword;

import java.util.Date;

public class Product {

    private String code;                    // 상품코드
    private String barnd;                   // 제조사
    private String name;                    // 상품명
    private int price;                      //가격
    private Date manufacturingDate;         // 제조일자

    // 기본생성자
    public Product() {
        /*
        * 아무 클래스도 상속받지 않았는 데 super()가 호출된다.
        * java.lang.Object클래스의 생서자를 호출하게 된다.
        * 이유는 모든 클래스느 Object 클래스의 후손이기 때문이다.*/
        super();
        System.out.println("Product 클래스의 기본생성자 호출함...");
    }

    public Product(String code, String barnd, String name, int price, Date manufacturingDate) {
        super();
        this.code = code;
        this.barnd = barnd;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product클래스의 매개변수 있는 생성차 호출....");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarnd() {
        return barnd;
    }

    public void setBarnd(String barnd) {
        this.barnd = barnd;
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

    public String getInformation(){
        return "code = " + this.code
                + ", barnd = " + this.barnd
                + ", name = " + this.name
                + ", price = " + this.price
                + ", manufacturingDate = " + this.manufacturingDate;
    }
}
