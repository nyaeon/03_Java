package com.ohgiraffers.api.member.vo;

import java.time.LocalDate;

public class Member {
    public int memberNo;
    public String memberName;
    public int height;
    public int weight;
    public LocalDate birthday;

    public Member() {}

    public Member(int memberNo, String memberName, int height, int weight, LocalDate birthday) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
    }

    // getter
    public int getMemberNo() {
        return memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    //setter
    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String information() {
        return memberNo + " " + memberName + " " + height + " " + weight + " " + birthday;
    }
}
