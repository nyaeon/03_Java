package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {

        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookDTO1 = new BookDTO(); // 객체 생성
        bookDTO1.printInformation();

        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookDTO2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookDTO2.printInformation(); // 3개의 매개변수 생성

        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookDTO3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        bookDTO3.printInformation(); // 5개의 매개변수 생성

    }
}