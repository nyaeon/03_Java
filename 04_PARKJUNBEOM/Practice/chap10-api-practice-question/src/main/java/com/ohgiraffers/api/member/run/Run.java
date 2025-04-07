package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] memberTokens = data.split("\\|");

        Member[] members = new Member[memberTokens.length];

        for (int i = 0; i < members.length; i++) {
            String[] memberToken = memberTokens[i].split(",");

            int memberNo = Integer.parseInt(memberToken[0]);
            String memberName = memberToken[1];
            int height = Integer.parseInt(memberToken[2]);
            int weight = Integer.parseInt(memberToken[3]);
            LocalDate brith = LocalDate.parse(memberToken[4],
            DateTimeFormatter.ofPattern("yyyyMMdd"));

            members[i] = new Member(memberNo, memberName, height, weight, brith);
        }

        for (Member member : members) {
            System.out.println(member.information());
        }
    }
}
