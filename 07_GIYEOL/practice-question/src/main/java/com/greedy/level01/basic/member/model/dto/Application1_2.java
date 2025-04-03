package com.greedy.level01.basic.member.model.dto;

public class Application1_2 {
    public static void main (String[] args){
BookDTO book = new BookDTO();
System.out.println("title = " + book.getTitle());
book.setTitle("Java의 정석");
System.out.println("publisher = " + book.getPublisher());
book.setPublisher("도우출판");
System.out.println("author = " + book.getAuthor());
book.setAuthor("남궁성");
System.out.println("price = " + book.getPrice());
book.setPrice(0);
System.out.println("discountRate = " + book.getDiscountRate());
book.setDiscountRate(0.0);
        System.out.println(book.getTitle()+", " + book.getPublisher()+
                ", " + book.getAuthor()+"," + book.getPrice()+", " + book.getDiscountRate());
book.setTitle("홍길동");
book.setPublisher("활빈당");
book.setAuthor("허균");
book.setPrice(50000000);
book.setDiscountRate(0.5);
   System.out.println(book.getTitle()+", " + book.getPublisher()+
                ", " + book.getAuthor()+"," + book.getPrice()+", " + book.getDiscountRate());
    }
}
