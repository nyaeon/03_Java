package com.ohgiraffers.hw1.model.dto;

public class Member {
    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member() {}
    public Member(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "이름: " + name + '\n' +
                "나이: " + age + '\n' +
                "성별: " + gender + '\n' +
                "쿠폰: " + couponCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }
}
