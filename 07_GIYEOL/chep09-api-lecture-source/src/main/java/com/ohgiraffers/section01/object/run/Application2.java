package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {
    public static void main(String[] args) {
        /***
         * object 클래스의 equals() 메소드
         * equals() 메소드 오버라이딩
         * equals() 메소드는 매개변수로 전달받은 인스턴스와 == 을 연산하여 true of false를 반환함
         * 동일한 인스턴스인지를 비교하는 기능을 수행
         */

        /***
         * 동일 객체와 동등 객체
         * 동일객체: 주소가 동일한 인스턴스
         * 동등객체: 주소는 다르지만 필드값이 동일한 객체
         */
        Book book1 = new Book(1,"홍길동전","허균",5000);
        Book book2 = new Book(1,"홍길동전","허균",5000);
        System.out.println("Book 1: " + book1.hashCode());
        System.out.println("Book 2: " + book2.hashCode());

        System.out.println("두 인스턴스의 == 연산비교: "+ (book1 == book2));
        System.out.println("두 인스턴스의 equals() 비교: "+ (book1.equals(book2)));
    }
}
