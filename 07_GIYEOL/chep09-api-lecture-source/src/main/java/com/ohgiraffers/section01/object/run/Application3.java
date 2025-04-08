package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {
        /***
         * object 클래스의 명세에 작성된 일반 규약에 따르면
         * equals() 메소드를 제정의하는 경우 반드시 hashcode() 메소드도 제정의한다
         * 만약 hashcode()를 제정의 하지 않으면 같은 값을 가지는 동등객채는
         * 같은 해쉬코드 값을 가져야한다는 규약에 위반됨
         * (강제성은 없지만 규약대로 작성하는 것이 좋음)
         */

        Book book1 = new Book(1,"홍길동전","허균",5000);
        Book book2 = new Book(1,"홍길동전","허균",5000);

        System.out.println("book1: " + book1.hashCode());
        System.out.println("book2: " + book2.hashCode());

        Map<Book,String> map = new HashMap<>();
        map.put(new Book(1,"홍길동전","허규",50000),"sold");

        Book key = new Book(1,"홍길동전","허규",50000);
        String str = map.get((new Book(1,"홍길동전","허규",50000)));
        System.out.println("str = "+ str);
        String str1 ="java";
        String str2 ="java";
        System.out.println(str1 ==str2);


    }
}
