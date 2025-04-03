package com.greedy.level02.normal.book.run;

public class Application {
    public static void main(String[] args) {

        // 기본생성자를 통해서 객체를 생성하고 값을 추가하는 방법
        BookDTO bookDTO1 = new BookDTO();
        bookDTO1.printInformation();

        // 매개변수가 있는 생성자를 이용해서 생성시점부터 값을 초기화하고 시작하는 방법
        BookDTO bookDTO2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookDTO2.printInformation();

        BookDTO bookDTO3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        bookDTO3.printInformation();

    }
}
