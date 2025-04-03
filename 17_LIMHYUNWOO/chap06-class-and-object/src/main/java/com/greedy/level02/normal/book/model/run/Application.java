package com.greedy.level02.normal.book.model.run;

import com.greedy.level02.normal.book.model.dto.*;

public class Application {
    public static void main(String[] args) {
        BookDTO  bt = new BookDTO();
        bt.printInformation();
        bt = new BookDTO("자바의 정석" , "도우출판","남궁성");
        bt.printInformation();
        bt = new BookDTO("홍길동전" , "활빈당", "허균" , 5000000,0.5);
        bt.printInformation();

    }
}
