package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;

public class Member {

    private int number;
    private String name;
    private int height;
    private int weight;
    private LocalDate birth;

    public Member() {}

    public Member(int number, String name, int height, int weight, LocalDate birth) {
        this.number = number;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public String infomation() {
        return "회원번호 : " + this.number +
                ", 이름 : " + this.name +
                ", 키 : " + this.height +
                ", 몸무게 : " + this.weight +
                ", 생일 : " + this.birth;
    }

}
