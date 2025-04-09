package com.com.greedy.level02.normal.book.run;

import com.com.greedy.level02.normal.book.model.dto.BookDTO;
import com.com.greedy.level02.normal.book.model.vo.StudentV;

public class Application {

    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.printInformation();
        bookDTO = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookDTO.printInformation();
        bookDTO = new BookDTO("자바의 정석", "도우출판", "남궁성", 5000000, 0.5);
        bookDTO.printInformation();

        StudentV studentV = new StudentV(1, 2, "홍길동", 175.5, '남');
        studentV.printInformation();
    }
}
