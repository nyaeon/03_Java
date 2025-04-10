package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Run {

    public static void main(String[] args) {
        String input = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        StringTokenizer st = new StringTokenizer(input, "|");
        Member[] members = new Member[st.countTokens()];

        int cnt = 0;
        while (st.hasMoreTokens()) {
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
            int memberNo = Integer.parseInt(st2.nextToken());
            String name = st2.nextToken();
            int h = Integer.parseInt(st2.nextToken());
            int w = Integer.parseInt(st2.nextToken());
            LocalDate birth = LocalDate.parse(st2.nextToken(),
                DateTimeFormatter.ofPattern("yyyyMMdd"));
            members[cnt++] = new Member(memberNo, name, h, w, birth);
        }

        for (Member member : members) {
            System.out.println(member.information());
        }
    }

}
