package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;

public class Member {
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private LocalDate birthDate;
    private String information;

    public Member() {
    }

    public Member(int memberNo, String memberName, int height, int weight, LocalDate birthDate) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    public String information() {
        return "memberNo: " + memberNo + ", memberName: " + memberName
                + ", height: " + height + ", weight: " + weight;
    }




}
