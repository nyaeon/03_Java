package com.greedy.level02.normal.book.model.dto;

public class Application {
    public static void main(String[] args) {
        // 기본생성자를 통해서 객체를 생성하고 값을 추가하는 방법
        BookDTO book1 = new BookDTO();
        book1.printInfomation();
        // 매개변수가 있는 생성자를 이용해서 생성지점부터 값을 초기화하고 시작하는 방법
        BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성", 0, 0);
        book2.printInfomation();
        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균",5000000, 0.5);
        book3.printInfomation();



    }
}
