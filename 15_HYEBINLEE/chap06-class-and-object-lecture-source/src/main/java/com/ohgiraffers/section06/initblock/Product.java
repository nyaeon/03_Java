package com.ohgiraffers.section06.initblock;

public class Product {

//    private String name;
//    private int price;
//    private static String brand;
    
    private String name = "갤럭시";
    private int price = 2000000;
    private static String brand = "삼송";

    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 900000;
        /*
        * 인스턴스 초기화 블럭에서는 static 필드를 초기화 할 수 있는 것 처럼보인다.
        * 하지만 static 초기화 블럭은 클래스가 로드될때 이미 기본값으로 초기화를 진행했다.
        * 따라서 인스턴스 초기화 블럭이 동작하는 시점에서는 이미 초기화가 진행된
        * 정적 필드에 인스턴스 초기화 블럭에서 대입한 값을 덮어쓰게 된다.
        * */
        //brand = "사과";
    }

    static {
        /*
        * static초기화 블럭에서는 non-static 필드를 초기화하지 못한다.
        * 정적 초기화 블럭은 클래스 로드 시에 동작한다.
        * 따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문에
        * 존재하지 않는 인스턴스변수에 초기화하는 것은 시기상으로 불가능하다.
        * */
//        name = "아이뽕";
//        price = 30000000;
        brand = "헬지";
    }
    
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
