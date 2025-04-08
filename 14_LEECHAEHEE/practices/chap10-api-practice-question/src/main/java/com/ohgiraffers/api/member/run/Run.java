package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] records = data.split("\\|");
        Member[] members = new Member[records.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        for (int i = 0; i < records.length; i++) {
            String[] str = records[i].split(",");
            int memberNo = Integer.parseInt(str[0]);
            String memberName = str[1];
            int height = Integer.parseInt(str[2]);
            int weight = Integer.parseInt(str[3]);
            LocalDate birthDate = LocalDate.parse(str[4], formatter);

            members[i] = new Member(memberNo, memberName, height, weight, birthDate);
        }

        // 결과 출력
        for (Member m : members) {
            System.out.println(m.information());
        }
    }
}
