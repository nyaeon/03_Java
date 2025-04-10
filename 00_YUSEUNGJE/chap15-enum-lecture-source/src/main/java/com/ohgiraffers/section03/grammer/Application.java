package com.ohgiraffers.section03.grammer;

public class Application {

    public static void main(String[] args) {

        /*
        * enum 타입의 필드를 최초 사용 시에만 열거 타입의 인스턴스를 생성하고 생성자를
        * 따로 호출하지 않는다. 또한 enum 타입은 set으로 바꿔 반복시키며 필드들을
        * 한번에 확인하고 활용할 수 있다.
        * */
        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin.name());
        System.out.println(admin.getNameToLowerCase());


    }
}
