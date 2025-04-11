package com.ohgiraffers.section06.initblock;

public class Product {
  //  private String name;
  //  private int price;
  //  private static String brand;
    private String name="갤럭시";
    private int price = 200;
    private static String brand = "애니콜";
    //인스턴스 초기화 블론
    {
        name = "사이언";
        price = 900;
        /***
         * 인스턴스 초기화 블럭에는 static 필드를 초기화 할수 있는 것처럼 보인다
         * 하지만 static 초기화 블럭은 클래스가 로드될때 이미 기본값으로 초기화를 진행함
         * 따라서 인스턴스 초기화 블럭이 동작하는 시점에서는 이미 초기화가 진행됨
         * 정적 픽드에 인스턴스 초기화 블럭에서 대입한 값을 덮어 쓰게 된다.
         */
        // brand = "사과";
    }
    static {
        /***
     static 초기화 블럭에서는 non-static 필드를 초기화하지 못함
     정적 초기화 블럭은 클래스 로드 시에 동작
     따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 꺠문에
     존재하지 않는 인스턴스 변수에 초기화하는 것은 시기상으로 불가함 */
    //    name ="아이폰";
    //    prcie = 3000000;
        brand ="헬지";
    }
    public Product() {
        System.out.println("기본생성자");
    }
    public Product(String name, int price,String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출");

    }
    public  String getinformation() {
        return "name = "+name+",price = "+price+",brand = "+brand;
    }
}
