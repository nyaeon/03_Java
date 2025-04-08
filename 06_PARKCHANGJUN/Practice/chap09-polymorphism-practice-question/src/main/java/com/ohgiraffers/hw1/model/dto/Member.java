package com.ohgiraffers.hw1.model.dto;

public class Member {
    private String name;     //회원명
    private int age;         // 회원나이
    private char gender;     // 성별
    private int couponCount; // 요리학원쿠폰개수 = 0
    //

    public Member() {
        super(); // 부모클래스의 기본 생성자 호출
    } // 기본 생성자 생성, Member 클래스

    // 매개 변수 name, age, gender의 생성자
    public Member(String name, int age, char gender) {
        this.name = name; // 전달받은 name 값을 현재 객체의 name 필드에 저장.
        this.age = age; // 전달받은 age 값을 현재 객체의 age 필드에 저장.
        this.gender = gender; // 전달받은 gender 값을 현재 객체의 gender 필드에 저장.
        this.couponCount = 0; // 정수형 필드는 초기화 하지 않아도 자동으로 0으로 초기화. 여기선 생략 가능.
    } // this 키워드는 생성자 매개변수와 클래스 필드가 같은 이름일 때, 구분하기 위해 사용되는 구문.

//    getter, setter를 통해 더 안전하고, 유연하고, 확장 가능한 코드를 만들 수 있다.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "," + " 나이 : " + age + ", 성별 : " + gender + ", 쿠폰 : " + couponCount;
    }
    // toString 메서드는 객체의 정보를 문자열 형태로 반환

}