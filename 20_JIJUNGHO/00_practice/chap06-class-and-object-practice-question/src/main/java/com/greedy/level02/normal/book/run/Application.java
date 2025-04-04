package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookdto1 = new BookDTO();
        System.out.println(bookdto1.printInformation());
        BookDTO bookdto2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        System.out.println(bookdto2.printInformation());
        BookDTO bookdto3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        System.out.println(bookdto3.printInformation());
    }
}
