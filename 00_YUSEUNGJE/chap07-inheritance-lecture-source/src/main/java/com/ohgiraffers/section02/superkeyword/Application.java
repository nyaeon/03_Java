package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        /*
         * super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의 인스턴스도
         *         함께 생성하게 된다. 이 때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수도
         *         자식 클래스 내의 모든 생성자의 메소드 내에서 선언하지 않고도 사용할 수 있는 레퍼런스변수이다.
         * super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는
         *           부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의 다른 생성자를 호출하는
         *           구문이라면, super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를
         *           호출할 수 있도록 한 구문이다.
         * */
        Product product1 = new Product();
        System.out.println(product1.getInformation());

        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드3", 2800000, new Date());
        System.out.println(product2.getInformation());

        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInformation());

        Computer computer3 = new Computer("S-01234", "삼송", "은하수Z폴드3", 2800000, new Date()
                , "퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInformation());
    }
}
