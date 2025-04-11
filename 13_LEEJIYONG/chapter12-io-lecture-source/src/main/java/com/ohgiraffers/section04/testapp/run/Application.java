package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.service.MemberService;
import java.util.Scanner;

public class Application {

    private static final MemberService ms = new MemberService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
            ============ 회원 관리 프로그램 ============
            1. 모든 회원 정보 보기
            2. 회원 찾기
            3. 회원 정보 수정
            4. 회원 탈퇴
            9. 프로그램 종료
            메뉴를 선택해주세요 : """;
        while (true) {
            System.out.print(menu);
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    ms.findAllMember();
                    break;
                case 2:
                    ms.findMemberBy(chooseMemMo());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }

    // 회원 ID를 입력받아 반환하는 메소드
    private static int chooseMemMo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원의 번호를 입력하세요 : ");
        return sc.nextInt();
    }
}
