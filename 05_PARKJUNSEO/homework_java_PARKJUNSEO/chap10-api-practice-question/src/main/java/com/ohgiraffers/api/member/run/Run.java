package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] memberArr = str.split("\\|");
        Member[] members = new Member[memberArr.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        for (int i = 0; i < memberArr.length; i++) {
            String[] memArr = memberArr[i].split(",");
            int memberNo = Integer.parseInt(memArr[0]);
            String name = memArr[1];
            int height = Integer.parseInt(memArr[2]);
            int weight = Integer.parseInt(memArr[3]);
            LocalDate birth = LocalDate.parse(memArr[4], formatter);

            members[i] = new Member(memberNo, name, height, weight, birth);
        }

        for (Member member : members) {
            System.out.println(member.information());
        }
    }
}
