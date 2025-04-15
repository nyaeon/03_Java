package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

// 직렬화를 해주는 이유 : 외부파일에 정보를 넣고 뺄 때
public class Member implements Serializable {

    private int mnmbNo;            // 회원 번호
    private String id;             // 회원 아이디
    private String pwd;            // 회원 비밀번호
    private int age;               // 회원 이름
    private String[] hobbies;      // 회원 취미들
    private BloodType bloodType;   // 회원 혈액형

    public Member() {
    }

    public Member(String id, String pwd, int age, String[] hobbies) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int membNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
        this.mnmbNo = membNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public int getMnmbNo() {
        return mnmbNo;
    }

    public void setMnmbNo(int mnmbNo) {
        this.mnmbNo = mnmbNo;
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
        return "Member{" +
                "mnmbNo=" + mnmbNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return mnmbNo == member.mnmbNo && age == member.age && Objects.equals(id, member.id) && Objects.equals(pwd, member.pwd) && Objects.deepEquals(hobbies, member.hobbies) && bloodType == member.bloodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mnmbNo, id, pwd, age, Arrays.hashCode(hobbies), bloodType);
    }
}
