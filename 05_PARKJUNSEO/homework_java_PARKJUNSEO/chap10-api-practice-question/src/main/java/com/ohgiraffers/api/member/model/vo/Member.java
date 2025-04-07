package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Member {
    int memberNo;
    String memberName;
    int height;
    int weight;
    LocalDate birth;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Member(int memberNo, String memberName, int height, int weight, LocalDate birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public String information() {
        return "회원번호: " + memberNo +
                "\n이름: " + memberName +
                "\n키: " + height + "cm" +
                "\n몸무게: " + weight + "kg" +
                "\n생년월일: " + birth.format(formatter);
    }

}
