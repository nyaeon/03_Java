package com.greedy.level02.normal.book.model.dto;

public class Application {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO();
        BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book1.printInformation();
        book2.printInformation();
        book3.printInformation();


    }
}
