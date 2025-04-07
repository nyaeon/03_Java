package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Application3 {

    public static void main(String[] args) {

        /*
         * Object 클래스의 명세에 작성된 일반 규약에 따르면
         * equals() 메소드를 재정의하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어있다.
         * 만약 hashCode()를 재정의 하지않으면 같은 값을 가지는 동등객체는
         * 같은 해쉬코드값을 가져야한다는 규약에 위반하게 된다.
         * (강제성은 없지만 규약대로 작성하는 것이 좋다.)
         */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());

        Map<Book, String> map = new HashMap<>();
        map.put(new Book(1,"홍길동전","허균",50000), "sold");

        Book key = new Book(1,"홍길동전","허균",50000); // 동등 객체라 동일 객체로 바꿀거임
        String str = map.get(key);

        System.out.println("str = " + str);

        //System.out.println("hello".charAt(0));

        String str1 = "java"; //얕은 복사라 주소값이 같음
        String str2 = "java";

        String str3 = new String("helloworld");//생성자로 만들어 heap 영역에 가. 그래서 주소값은 다르고 값 자체만 같음 그래서 동등객체


        //그래서 ==로 물어봐도 같다고 나옴
        System.out.println("str1과 str2는 같은가? : " + (str1 == str2));

    }
}
