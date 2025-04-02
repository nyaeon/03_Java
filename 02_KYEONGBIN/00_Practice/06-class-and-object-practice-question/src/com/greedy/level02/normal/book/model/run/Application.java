package com.greedy.level02.normal.book.model.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {

        BookDTO book = new BookDTO();

        // OUTPUT 1
        System.out.println("-------------------------------------------");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
        System.out.println("DiscountRate: " + book.getDiscountRate());
        System.out.println("-------------------------------------------");

        // Case 1 INPUT
        book.setTitle("자바의 정석");
        book.setPublisher("도우출판");
        book.setAuthor("남궁성");
        book.setPrice(0);
        book.setDiscountRate(0.0);

        // Case 1 OUTPUT
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
        System.out.println("DiscountRate: " + book.getDiscountRate());
        System.out.println("-------------------------------------------");

        // Case 2 INPUT

        BookDTO book2 = new BookDTO();

        book2.setTitle("홍길동전");
        book2.setPublisher("활빈당");
        book2.setAuthor("허균");
        book2.setPrice(5000000);
        book2.setDiscountRate(0.5);

        // Case 2 OUTPUT
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Publisher: " + book2.getPublisher());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: " + book2.getPrice());
        System.out.println("DiscountRate: " + book2.getDiscountRate());
        System.out.println("-------------------------------------------");


        // 매개변수가 있는 생성자를 이용해서 생성시점부터 값을 초기화하고 시작하는 방법
        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);



    }
}
