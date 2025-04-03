package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;  // 상품코드
    private String brand; // 제조사
    private String name; // 상품명
    private int price;       // 가격
    private Date manafacturingDate;  // 제조일자

    // 기본생성자
    public Product() {
        /**
         * 아무 클래스도 상속받지 않았는데 super()가 호출이 된다.
         * java.lang.Object클래스의 생성자를 호출하게 된다.
         * 이유는 모든 클래스는 Object 클래스의 후순이기 때문이다.
         **/
        super();  // Object클래스의 생성자를 찾아감
        System.out.println("Product클래스의 기본생성자 호출함. ");
    }

    public Product(String code, String brand, String name, int price, Date manafacturingDate) {
        super();
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manafacturingDate = manafacturingDate;
        System.out.println("Product클래스의 매개변수 있는 생성자 호출");
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

    public Date getManafacturingDate() {
        return manafacturingDate;
    }

    public void setManafacturingDate(Date manafacturingDate) {
        this.manafacturingDate = manafacturingDate;
    }

    /***
     * super.getInfotmation() : 정상적으로 부모의 메소드 호출
     * this.getInformation() : 본인의 getInformation() 호출 =>재귀호출이 일어나며 stackOverflow발생
     * getInformation() : this.이 자동 추가되어 재귀호출이 일어나고 stackOverflow발생
     *
     * 따라서 이런 경우 super.을 명시해서 사용
     */

    public String getInformation(){
        return " code =" +this.code
                + ", brand =" +this.brand
                + ", name =" +this.name
                + ", price =" +this.price
                + ", manafacturingDate =" +this.manafacturingDate;
    }
}
