package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;

public class Member {
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private LocalDate brith;

    public Member(int memberNo, String memberName,
                  int height, int weight, LocalDate brith) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.brith = brith;
    }
    public String information(){
        return memberNo + " , " + memberName +
                " , " + height + " , " +
                weight + " , " + brith;
    }
}
