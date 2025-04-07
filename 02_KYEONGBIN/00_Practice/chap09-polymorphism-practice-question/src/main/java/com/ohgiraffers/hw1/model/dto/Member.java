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

    public String toString() {
        return Member.class.getSimpleName() +
                " [ name = " + name +
                ", age = " + age +
                ", gender = " + gender +
                ", coupons = " + couponCount + " ]";
    }
}
