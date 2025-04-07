package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Run {

    public static void main(String[] args) {


        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] memberSplit = str.split("\\|");

        Member[] member = new Member[memberSplit.length];
        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        for (int i = 0; i < memberSplit.length; i++) {
            String[] memberInfo = memberSplit[i].split(",");
            int number = Integer.parseInt(memberInfo[0]);
            String name = memberInfo[1];
            int height = Integer.parseInt(memberInfo[2]);
            int weight = Integer.parseInt(memberInfo[3]);
            LocalDate birth = LocalDate.parse(memberInfo[4], fomatter);

            member[i] = new Member(number, name, height, weight, birth);

            System.out.println(member[i].infomation());
        }

    }
}
