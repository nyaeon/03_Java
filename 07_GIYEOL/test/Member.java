package com.ohgiraffers.section04.test;

public class Member  {
    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member() {
    }

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
        return
                "회원명 ='" + name  +
                ", 회원 나이 =" + age +
                ", 성별=" + gender +
                ", 쿠폰 개수 =" + couponCount ;
    }
}
