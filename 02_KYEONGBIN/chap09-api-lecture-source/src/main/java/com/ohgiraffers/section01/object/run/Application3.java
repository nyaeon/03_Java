package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {

        /*
        * Object 클래스의 명세에 작성된 일반 규약에 따르면
        * equals() 메소드를 재정의 하는 경우 반드시 해쉬코드 메소드도 재정의 하도록 되어 있다.
        * 만약 해쉬코드를 재정의 하지 않으면 같은 값을 가지는 동등객체는
        * 같은 해쉬코드 값을 가져야 한다는 규약에 위반되게 된다
        * (강제성은 없지만 규약되로 작성하는 것이 좋다)
        * */

        Object book1 = new Book (1, "홍길동전", "허균", 50000);
        Book book2 = new Book (1, "홍길동전", "허균", 50000);

        System.out.println("The hashcode for the book1 : " + book1.hashCode());
        System.out.println("The hashcode for the book2 : " + book2.hashCode());

        Map<Book, String> map = new HashMap<>(); // 키(Book)와 값(Book)을 저장하는 HashMap 생성

        map.put(new Book(1, "홍길동전", "허균", 50000), "sold");

        String str = map.get(new Book (1, "홍길동전", "허균", 50000));
        System.out.println("str : " + str);

        /*
        * Task :com.ohgiraffers.section01.object.run.Application3.main()
          The hashcode for the book1 : -1619022418 // 음수로 나오긴 하는데 같기만 하면됨
          The hashcode for the book2 : -1619022418 // 오버플로우? 났다고 함
          str : sold
        * */
    }
}
