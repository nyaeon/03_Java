package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {

    public static void main(String[] args) {

        /*
        * Object 클래스의 명세에 작성된 일반 규약에 따르면
        * equals() 메소드를 재정의하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어있다.
        * 만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등객체는
        * 같은 해쉬코드값을 가져야한다는 규칙에 위반되게 된다.
        * (강제성은 없지만 규약대로 작성하는것이 좋다)
         */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1의 hashCode() = " + book1.hashCode());
        System.out.println("book2의 hashCode() = " + book2.hashCode());

        Map<Book, String> map = new HashMap<>(); // ++ 파이썬의 키밸류랑 비슷하네 키값 밸류값 같이, 첫번째 두번째에 주고 묶어서 들고 다닐 수 있다
        map.put(new Book(1, "홍길동전", "허균", 50000), "sold");

        Book key = new Book(1, "홍길동전", "허균", 50000);
        String str = map.get(key);

        System.out.println("str : " + str);




    }
}
