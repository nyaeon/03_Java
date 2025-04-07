package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) {
//        각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.
        // 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다
        String text = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        StringTokenizer st = new StringTokenizer(text, "|");

        Member[] members = new Member[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            String[] memberInfos = st.nextToken().split(",");
            Member member = new Member(
                    Integer.parseInt(memberInfos[0]),
                    memberInfos[1],
                    Integer.parseInt(memberInfos[2]),
                    Integer.parseInt(memberInfos[3]),
                    LocalDate.parse(memberInfos[4], DateTimeFormatter.ofPattern("yyyyMMdd"))
            );
            members[i++] = member;
            System.out.println(member.information());
        }
    }
}
