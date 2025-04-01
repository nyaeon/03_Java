package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDto;

import java.awt.print.Book;

public class Application {

    public static void main(String[] args) {

        BookDto bd = new BookDto();
        bd.printInformation("자바의 정석", "도우출판", "남궁성");


    }
}
