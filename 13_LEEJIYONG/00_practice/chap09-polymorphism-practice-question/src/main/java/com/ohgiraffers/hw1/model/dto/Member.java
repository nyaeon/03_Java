package com.ohgiraffers.hw1.model.dto;

public class Member {

    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("이름 : ").append(name).append("\n");
        sb.append("나이 : ").append(age).append("\n");
        sb.append("성별 : ").append(gender).append("\n");
        sb.append("쿠폰개수 : ").append(couponCount);

        return sb.toString();
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
}
