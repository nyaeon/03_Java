package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;

public class Member implements Serializable {

    private int membNo;
    private String id;
    private String pwd;
    private int age;
    private String[] hobbies;
    private BloodType bloodType;

    public Member() {
    }

    public Member(int membNo, String id, String pwd, int age, String[] hobbies) {
        this.membNo = membNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int membNo, String id, String pwd, int age, String[] hobbies,
        BloodType bloodType) {
        this.membNo = membNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public int getMembNo() {
        return membNo;
    }

    public void setMembNo(int membNo) {
        this.membNo = membNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "[" +
            "membNo=" + membNo +
            ", id='" + id + '\'' +
            ", pwd='" + pwd + '\'' +
            ", age=" + age +
            ", hobbies=" + Arrays.toString(hobbies) +
            ", bloodType=" + bloodType +
            ']';
    }
}
