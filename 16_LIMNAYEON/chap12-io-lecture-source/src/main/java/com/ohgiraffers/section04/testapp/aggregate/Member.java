package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Member implements Serializable {

    private int membNo;         // 회원번호
    private String id;          // 회원 아이디
    private String pwd;         // 회원 비밀번호
    private int age;            // 회원 나이
    private String[] hobbies;   // 회원 취미들
    private BloodType bloodType;    // 회원 혈액형

    public Member() {
    }

    public Member(String id, String pwd, int age, String[] hobbies) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int membNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return membNo == member.membNo && age == member.age && Objects.equals(id, member.id) && Objects.equals(pwd, member.pwd) && Objects.deepEquals(hobbies, member.hobbies) && bloodType == member.bloodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(membNo, id, pwd, age, Arrays.hashCode(hobbies), bloodType);
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
