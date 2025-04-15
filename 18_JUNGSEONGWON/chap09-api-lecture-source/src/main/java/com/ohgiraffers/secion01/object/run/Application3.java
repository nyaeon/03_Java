package com.ohgiraffers.secion01.object.run;

import com.ohgiraffers.secion01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {
        /*
        * Object 클래스의 명세ㅔ에 작성된 일반 규약에 따르면
        * equals() 메소드를 재정의하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어있다.
        * 만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등객체는
        * 같은 해쉬코드 값을 가져야 한다는 규약에 위반되게 된다.
        * (강제성은 없지만 규약대로 작성하는 것이 좋다.)
        * */
        
        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("hashCode() = " + book1.hashCode());
        System.out.println("hashCode() = " + book2.hashCode());


        Map<Book,String> map = new HashMap<>();
        map.put(new Book(1,"홍길동전","허균",50000),"sold");

        Book key = new Book(1,"홍길동전","허균",50000);
        String str = map.get(key);
        
//        String str = map.get(new Book(1,"홍길동전","허균",50000));
        System.out.println("str = " + str);

        System.out.println("hello".charAt(1)); //charAt(n) 문자의 n번째에 위치한 초성을 출력함.

        String str3 = "java";
        String str2 = "java";
        System.out.println(str3 == str2);
    }
}
