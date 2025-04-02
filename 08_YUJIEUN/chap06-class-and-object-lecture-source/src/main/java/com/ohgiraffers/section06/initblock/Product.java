package com.ohgiraffers.section06.initblock;

public class Product {

    private String name;
    private int price;
    private static String brand;

    public Product() {
        System.out.println("기본생성자 호출됨");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수있는 생성자 호출");
    }

    public String getInformation() {
        return "name = " + name
                + ", price = " + price
                + ", brand = " + brand;
    }
}