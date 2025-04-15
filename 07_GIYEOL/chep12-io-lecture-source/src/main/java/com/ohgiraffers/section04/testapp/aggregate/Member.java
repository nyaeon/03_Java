package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Member implements Serializable {

    private int memberNo;                 //번호
    private String id;                  //아이디
    private String pwd;                 //비번
    private int age;                    //나이
    private String[] hobbies;           //취미
    private BloodType bloodType;        //혈액형


    public Member() {
    }

    public Member(String id, int age, String pwd, String[] hobbies) {
        this.id = id;
        this.memberNo = memberNo;
        this.age = age;
        this.pwd = pwd;
        this.hobbies = hobbies;
    }
    public Member(int memberNo,String id, String pwd, int age,String[] hobbies,BloodType bloodType) {
        this.memberNo = memberNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public int getMembNo() {
        return memberNo;
    }

    public void setMembNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[" +
                "memberNo=" + memberNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberNo == member.memberNo && age == member.age && Objects.equals(id, member.id) && Objects.equals(pwd, member.pwd) && Objects.deepEquals(hobbies, member.hobbies) && bloodType == member.bloodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberNo, id, pwd, age, Arrays.hashCode(hobbies), bloodType);
    }
}

