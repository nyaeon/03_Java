package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        // 기본 생성자를 통해서 객체를 생성하고 값을 추가하는 방법
        BookDTO book = new BookDTO();
        book.printInformation();
        // 매개변수가 있는 생성자를 이용해서 생성 시점부터 값을 초기화하고 시작하는 방법
        BookDTO book1 = new BookDTO("자바의 정석", "도우출판", "남궁성", 0, 0.0);
        book1.printInformation();

        BookDTO book2 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book2.printInformation();

    }
}

