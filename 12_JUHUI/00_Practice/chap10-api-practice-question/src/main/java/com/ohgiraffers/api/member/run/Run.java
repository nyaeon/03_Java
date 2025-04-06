package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.vo.Member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {

    public static void main(String[] args) {

        // 회원정보가 담긴 문자열
        String membersInfo = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        // '|'를 기준으로 각 회원정보 분리
        String[] memberInfoArray = membersInfo.split("\\|");

        // 회원 객체 배열 생성 (회원 수만큼)
        Member[] members = new Member[memberInfoArray.length];

        // 각 회원정보를 처리하여 Member 객체 생성 및 배열에 추가
        for (int i = 0; i < memberInfoArray.length; i++) {
            // 각 회원정보를 ','로 분리
            String[] memberDetails = memberInfoArray[i].split(",");

            // 파싱된 데이터를 각 변수에 저장
            int memberNo = Integer.parseInt(memberDetails[0]);
            String memberName = memberDetails[1];
            int height = Integer.parseInt(memberDetails[2]);
            int weight = Integer.parseInt(memberDetails[3]);

            // 생일 문자열을 LocalDate로 변환
            // yyyyMMdd 형식의 문자열을 파싱
            LocalDate birthday = LocalDate.parse(
                    memberDetails[4],
                    DateTimeFormatter.ofPattern("yyyyMMdd")
            );

            // Member 객체 생성 및 배열에 추가
            members[i] = new Member(memberNo, memberName, height, weight, birthday);
        }

        // 회원정보 출력
        System.out.println("=== 회원정보 출력 ===");
        for (Member member : members) {
            System.out.println(member.information());
        }
    }
}
