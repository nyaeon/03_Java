package com.ohgiraffers.section01.object.book;

import java.util.Objects;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    // 기본 생성자
    public Book() {
    }

    // 모든 필드를 초기화하는 생성자
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 1. toString() 오버라이딩
    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    // 2. equals() 오버라이딩 --> Alt + insert에 나옴 // 매개변수가 null이어서 주소값이 없는 경우도 포함
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return true;
        }

        Book other = (Book) obj;

        if (this.number != other.number) {  // number는 정수형
            return false;
        }

        if (this.title == null) {

        } else if (!this.title.equals(other.title)) {  // 여기서 equals는 String 타입에서 오버라이딩 한 것
            return false;
        }

        if (this.author == null) {

        } else if (!this.author.equals(other.author)) {  // 여기서 equals는 String 타입에서 오버라이딩 한 것
            return false;
        }

        if (this.price != other.price) {
            return false;
        }
        return true;
    }

    // 3. hashCode() 오버라이딩  // 동등객체가 동일객체가 되도록 주소값을 변경함

    @Override
    public int hashCode() {

        /* 곱셈연산을 누적시켜야하기 때문에 0이 아닌 값으로 초기화  */
        int result = 1;

        /*
        * 필드마다 곱해줄 소수값을 선언
        * 31은 소수이기 때문에 연산 시 동일한 hashCode 값이 나오지 않을 확률을 증가시킨다. (31을 주로 사용)
        * */

        final int PRIME = 31 ;
        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }


}

