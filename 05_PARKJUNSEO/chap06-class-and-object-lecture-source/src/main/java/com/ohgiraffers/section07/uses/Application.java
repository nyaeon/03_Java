package com.ohgiraffers.section07.uses;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MemberServices memberManager = new MemberServices();

        while (true) {
            String menu = """
                    ========== 회원관리 프로그램 ==========
                    1. 회원 등록
                    2. 회원 전체 조회
                    9. 프로그램 종료
                    ====================================
                    메뉴 선택 : """;
            System.out.println(menu);
            int no = sc.nextInt();

            switch (no) {
                case 1: memberManager.signUpMembers();
                    break;
                case 2: memberManager.showAllMember();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습ㄴ다.");
            }

        }
    }

}
