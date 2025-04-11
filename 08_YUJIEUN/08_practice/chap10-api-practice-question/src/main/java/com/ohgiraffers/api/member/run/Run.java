package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Run {
    public static void main(String[] args) {

        String membersData = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] memberTokens = membersData.split("\\|");

        Member[] members = new Member[memberTokens.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");


        for (int i = 0; i < memberTokens.length; i++) {
            String[] info = memberTokens[i].split(",");
            int memberNo = Integer.parseInt(info[0]);
            String memberName = info[1];
            int height = Integer.parseInt(info[2]);
            int weight = Integer.parseInt(info[3]);
            LocalDate birth = LocalDate.parse(info[4], formatter);

            members[i] = new Member(memberNo, memberName, height, weight, birth);
        }

        for(Member member : members) {
            System.out.println(member.information());
        }



    }
}
