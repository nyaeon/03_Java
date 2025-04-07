package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;
import org.w3c.dom.ls.LSOutput;

public class Application1 {

    public static void main(String[] args) {

        /*
         * [Object]
         * 모든 클래스는 Object 클래스의 후손이다.
         * 따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
         *
         * Object 클래스의 메소드 중 관례상 많이 오버라이딩 해서 사용되는 메소드는
         * toString(), equals(), hashCode()
         * */

        // Book이라는 클래스에  .toString이라는 애가 모든 애들에 하나씩 숨겨져 있음
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);

        /*
        * Object가 가지고 있는 toString() 메소드는
        * 인스턴스가 생성될 때 사용한 full class name과 @ 그리고 16진수 해시코드가 문자열로 반환됨
        * 동일한 값을 가지는 인스턴스도 다른 해시코드 값을 가지고 있다.    //   Book2, Book3
        * Book에서 toString 오버라이딩 안해주면 해시코드와 주소가 나옴
        * */
        System.out.println("book1 = " + book1.toString());;
        System.out.println("book2 = " + book2.toString());;
        System.out.println("book3 = " + book3.toString());;
        System.out.println("========================================");
        System.out.println("book1 = " + book1);;
        System.out.println("book2 = " + book2);;
        System.out.println("book3 = " + book3);;    // 오버라이딩 해두면 컴파일러가 알아서 toString 형태로 알려줌
    }

}
