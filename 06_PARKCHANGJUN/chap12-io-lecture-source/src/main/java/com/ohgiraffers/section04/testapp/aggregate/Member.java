package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Member implements Serializable { // 직렬화를 하는 이유 :

    private int MemNo ;         // 회원번호
    private String id;           // 회원아이디
    private String pwd;          // 회원비밀번호
    private int age;             // 회원나이
    private String[] hobbies;    // 회원취미들
    private BloodType bloodType; // 회원혈액형

    public Member() {
    }

    public Member(String id, String pwd, int age, String[] hobbies) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int MemNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
        this.MemNo = MemNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public int getMemNo() {
        return MemNo;
    }

    public void setMemNo(int MemNo) {
        this.MemNo = MemNo;
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

    // 출력을 위한 메소드

    @Override
    public String toString() {
        return "[" +
                "MemNo=" + MemNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                ']';
    }

    // 해쉬코드 오버라이딩 하는 이유 다시 알아보기

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return MemNo == member.MemNo && age == member.age && Objects.equals(id, member.id) && Objects.equals(pwd, member.pwd) && Objects.deepEquals(hobbies, member.hobbies) && bloodType == member.bloodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MemNo, id, pwd, age, Arrays.hashCode(hobbies), bloodType);
    }
}
