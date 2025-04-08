package com.ohgiraffers.section01.object.book;

import java.util.Objects;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    // 기본생성자

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

    // 1. toString 오버라이딩
    @Override
    public String toString() {
        return "[" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ']';
    }
    // toString을 오버라이딩 하는 이유?

    // 2. equals() 오버라이딩
    @Override
    public boolean equals(Object obj) {

        if(this == obj) { // 주소값이 같다라는 뜻
            return true;
        }

        if(obj == null) {
            return false;
        }

        Book other = (Book) obj;

        if(this.number != other.number) { // number는 정수형. 비교 연산자 가능.
            return false;
        }

        if(this.title == null) { // 값을 안넣어주면 문자열은 널일수 있기때문

            if(other.title != null) {
                return false;
            }
        } else if (!this.title.equals(other.title)) {
            return false;
        }

        if(this.author == null) { // 값을 안넣어주면 문자열은 널일수 있기때문

            if(other.author != null) {
                return false;
            }
        } else if (!this.author.equals(other.author)) {
            return false;
        }

        if(this.price != other.price) {
            return false;
        }

        return true;
        // 이렇게 까지 쓰면 모든 필드를 비교한다는 코드이다.
        // 문자열 비교는 equals 사용해야 함. 문자열 비교는 == 비교 불가. 때문에 String에서 가져와야됨.
    }

    // 3. hashCode() 오버라이딩. 동등객체를 동일객체로 만들어주기.
    @Override
    public int hashCode() {

        /** 곱셈 연산을 누적시켜야하기 때문에 0이 아닌 값으로 초기화 **/
        int result = 1;

        /**
         * 필드마다 곱해줄 소수값(1과 자기자신)을 선언
         * 31은 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확률을 증가시킨다.
         */
        final int PRIME = 31;

        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;

    }

    // 커맨드 앤 눌러서 equals 생성
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(number, title, author, price);
//    }
}
