package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1 = " + book1.hashCode());
        System.out.println("book2 = " + book2.hashCode());

        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println("두 인스턴스의 equals() 비교 : " + (book1.equals(book2)));

        String str = "java";
        String str2 = "java";
        System.out.println(str == str2);
    }

/*
Object 클래스의 equals() 메소드

equals() 메소드 오버라이딩
equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true 또는 false 를 받음
즉, 동일한 인스턴스인지를 비교하는 기능을 함
 */





}
