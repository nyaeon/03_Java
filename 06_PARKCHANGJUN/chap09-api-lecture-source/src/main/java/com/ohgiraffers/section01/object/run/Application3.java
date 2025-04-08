package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Application3 {

    public static void main(String[] args) {

        /**
         * Object 클래스의 명세에 작성된 일반 규약에 따르면
         * equals() 메소드를 재정의하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어있다.
         * 만약 hashCode()를 재정의하지 않으면 같은 값을 가지는 동등객체는
         * 같은 해쉬코드값을 가져야한다는 규약에 위반하게 된다.
         * (강제성은 없지만 규약대로 작성하는것이 좋다)
         */

        // Object로 바꾸면 다형성이 적용됨
        // new book 초기화해서 boo1의 대입
        Book book1 = new Book(1, "홍길도전", "허균", 50000);
        Book book2 = new Book(1, "홍길도전", "허균", 50000);


        System.out.println("book1의 hashCode() = " + book1.hashCode());
        System.out.println("book2의 hashCode() = " + book2.hashCode());

        Map<Book, String> map = new HashMap<>(); // Map<키값, 벨류값>. 여기서 키값은 주소값이 된다.
        map.put(new Book(1, "홍길동전", "허균", 50000), "sold"); // map은 put에 의해 값을 추가

        Book key = new Book(1, "홍길동전", "허균", 50000);
        String str = map.get(key); // 주소값이 다르기 때문에 동등객체. 따라서 동일객체로 만들어줘야 한다.

        System.out.println("str : " + str);


        String str1 = "java";
        String str2 = "java";

        System.out.println(str1 == str2);

    }
}
