package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {
        /*
        *  Object 클래스의 명세에 작성된 일반 규약에 따르면
        * equals() 메소드를 재정의하는 경우 반드시 hashCode() 메소드도 재정의하도록 되어 있다.
        * 만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
        * 같은 해쉬코드값을 가져야 한다는 규약에 위반되게 된다.
        * (강제성은 없지만 규약대로 작성하는 것이 좋음)
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1의 hashCode() : " + book1.hashCode());
        System.out.println("book2의 hashCode() : " + book2.hashCode());

        Map<Book, String> map = new HashMap<Book, String>();
        map.put(new Book(1, "홍길동전", "허균", 50000), "sold");
        
        Book key = new Book(1, "홍길동전", "허균", 50000);
        String str = map.get(key);
        System.out.println("str = " + str);

        String str1 = "sold";
        String str2 = "sold"; // 주소값 같음
        String str3 = new String("sold"); // 주소값 다름
        System.out.println();

    }
}
