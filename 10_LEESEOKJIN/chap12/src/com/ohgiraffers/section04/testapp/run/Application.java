package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.service.MemberService;

import java.util.Scanner;
import java.util.stream.Stream;

public class Application {
    private static final MemberService memberService = new MemberService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        while (true) {
//            System.out.print("""
//                    ========== 회원 관리 프로그램 ==========
//                    1. 모든 회원 정보 보기
//                    2. 회원 찾기
//                    3. 회원 가입
//                    4. 회원 정보 수정
//                    5. 회원 탈퇴
//                    9. 프로그램 종료
//                    """);
//            System.out.print("> ");
//            int choice = sc.nextInt(); sc.nextLine();
//        }

        var intStream = Stream.iterate(0, i -> i + 1);
        intStream.forEach(System.out::println);
    }
}
