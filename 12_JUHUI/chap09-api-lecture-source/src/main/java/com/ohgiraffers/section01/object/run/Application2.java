package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {

        /*
         * Object 클래스의 equals() 메소드
         *
         * equals() 메소드 오버라이딩
         * equals 메소드는 매개변수로 전달받은 인스턴스와  == 연산하여 true or false를 반환한다.
         * 즉, 동일한 인스턴스인지를 비교하는 기능을 한다.
         */

        /*
         * 동일객체와 등동객체
         * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다. 주소값, 안의 안 값 같음
         * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고 한다. 안에 있는 값만 같음.
         *
         * 그래서 동등객체를 동일객체로 만들어줄 거임
         *
         */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());

        System.out.println("두 인스턴스의 == 연산 비교 : "+ (book1 == book2)); // 주소값 비교
        System.out.println("두 인스터스의 equals() 비교 : " + (book1.equals(book2)));
    }
}
