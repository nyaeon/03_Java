package com.ohgiraffers.hw1.model.dto;

public class AniBook extends Book { // Book 클래스를 상속받음.
    // 따라서 Book 클래스의 title, author, publisher 필드를 AniBook 클래스도 가질 수 있고 기능도 사용 가능.
    private int accessAge; // 제한 나이

    public AniBook() {} // 아무값도 없는 객체 생성. 기본 생성자 생성

    // 매개변수 title, autohor, publisher, accessAge의 생성자
    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher); // 부모 클래스(Book)의 생성자 호출. 초기화 진행
        this.accessAge = accessAge; // 자신의 필드 초기화
    }

    // getter, setter
    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + accessAge;
    }
}