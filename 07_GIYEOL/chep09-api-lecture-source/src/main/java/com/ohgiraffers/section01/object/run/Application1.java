package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application1 {
    /***
     * [Object]
     * 모든 클래스는 object 클래스의 후손이다
     * 따라서 object 클래스가 가진 메소드를 자신의 것처럼 사용 가능
     *
     * object 클래스의 메소드 중 관례상 많이 오버라이딩헤서 사용하는 메소드는
     * toStirng(),equals(),hashcode()
     */
    public static void main(String[] args) {
        Book book1= new Book(1,"홍길동전","허균",5000);
        Book book2= new Book(2,"목민심서","정약용",3000);
        Book book3= new Book(2,"목민심서","정약용",3000);

/***
 * object가 가지고 있는 toString() 메소드는
 * 인스턴스가 생성될 때 사용한 full class name과 @ 그리고 16진수 해쉬코드가 문자열로 반환
 * 동일한 값을 가지는 인스턴스도 다른 해쉬코드값을 가진다
 */
        System.out.println("book1"+book1);
        System.out.println("book2"+book2);
        System.out.println("book3"+book3);
        System.out.println("=========================");
        System.out.println("book1"+book1.toString());
        System.out.println("book2"+book2.toString());
        System.out.println("book3"+book3.toString());
    }
}
