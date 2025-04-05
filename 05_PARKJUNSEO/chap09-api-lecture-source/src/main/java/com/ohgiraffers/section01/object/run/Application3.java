package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {

    public static void main(String[] args) {

        /*
        * Object 클래스의 명세에 작성된 일반 규약에 따르면
        * equqls() 메소드를 재정의하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어있다.
        * 만약 hashCode()를 재정의하지 않으면 같은 값을 가지는 동등객체는
        * 같은 해시코드 값을 가져야 한다는 규약에 위반되게 된다.
        * (강제성은 없지만 규약대로 작성하는 것이 좋다.)
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        // 두 객체의 주소값은 다름
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());

        // Map<key, value>
        Map<Book, String> Map = new HashMap<>();

        // 이 둘은 동등 객체 (주소가 다름)
        Map.put(new Book(1, "홍길동전", "허균", 50000), "sold");
        Book key = new Book(1, "홍길동전", "허균", 50000);

        String str = Map.get(key);
        System.out.println("str = " + str);;

        // 단순히 " " 만든 String 간의 비교는 == 또는 equals() 모두 가능함
        // 그러나 String str3 = new String("Hello world")와 같은 경우는 heap 안의 string pool외에 저장하기 때문에 주소값이 달라짐
        // 또한 Scanner로 받은 값도 주소값이 달라지기 때문에 equals()로 비교해야 한다.
        // 문자열은 불변객체임. 이를 수정하거나 새로운 문자열을 합쳐주면 새로운 인스턴스와 주소값이 생성된다.
    }

}
