package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Run {

    public static void main(String[] args) {

        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        StringTokenizer st = new StringTokenizer(str, "|");

        Member[] members = new Member[st.countTokens()];
        int num = 0;

        while(st.hasMoreTokens()) {
            String member = st.nextToken();
            String[] sarr = member.split(",");

            Member m = new Member();
            m.setMemberNo(Integer.parseInt(sarr[0]));
            m.setMemberName(sarr[1]);
            m.setHeight(Integer.parseInt(sarr[2]));
            m.setWeight(Integer.parseInt(sarr[3]));
            m.setBirth(LocalDate.parse(sarr[4], DateTimeFormatter.ofPattern("yyyyMMdd")));

            members[num++] = m;
        }

        for(Member m : members) {
            System.out.println(m.information());
        }
    }
}
