package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;


public class Application {
    public static void main(String[] args) {
        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO book1 = new BookDTO();
        book1.printInformation();


        BookDTO book2 = new BookDTO("자바의정석","도우출판","남궁성");
        book2.printInformation();

        BookDTO book3 = new BookDTO("홍길동전","활빈당","허균",5000000,0.5);
        book3.printInformation();

    }
}

