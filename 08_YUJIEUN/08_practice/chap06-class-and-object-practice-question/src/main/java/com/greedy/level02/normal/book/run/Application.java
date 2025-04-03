package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력

        BookDTO bookDTO = new BookDTO();


        bookDTO.printInformation();


        bookDTO.setTitle("홍길동전");
        bookDTO.setPublisher("활빈당");
        bookDTO.setAuthor("허균");
        bookDTO.setPrice(5000000);
        bookDTO.setDiscountRate(0.5);
    }
}
