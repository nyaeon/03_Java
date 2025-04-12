package com.ohgiraffers.section04.testapp.Run;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;

import java.awt.*;
import java.util.Scanner;

public class Application {

    private static final MemberService ms = new MemberService();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String menu = """
                ======== 회원 관리 프로그램 ========
                1. 모든 회원 정보 보기
                2. 회원 찾기
                3. 회원 가입
                4. 회원 정보 수정
                5. 회원 탈퇴
                9. 프로그램 종료
                메뉴룰 선택해주세요 : """;
        while (true) {
            System.out.print(menu);
            int input = sc.nextInt();
            switch (input) {
                case 1: ms.findAllMembers(); break;
                case 2: ms.findMemberBy(chooseMemNo()); break;
                case 3: ms.registerMember(signUp()); break;
                case 4:
                    Member selected = ms.findMemberForMod(chooseMemNo());
                    if (selected == null) {continue;}
                    ms.modifyMember(reform(selected));
                        break;
                case 5: ms.removeMember(chooseMemNo()); break;
                case 9: return;
                default:
                    System.out.println("번호를 잘못 입력하였습니다.");
            }
        }

    }

    private static Member reform(Member selected) {
        Member modifiedMember = selected;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("==== 수정 서브 메뉴 ====");
            System.out.println("1. 패스워드");
            System.out.println("2. 나이");
            System.out.println("3. 취미");
            System.out.println("4. 혈액형");
            System.out.println("5. 메인 메뉴로 돌아가기");
            System.out.print("내용을 선택하세요: ");
            int chooseNo = sc.nextInt();
            sc.nextLine();
            switch(chooseNo) {
                case 1:
                    System.out.print("수정할 패스워드를 입력하세요: ");
                    modifiedMember.setId(sc.nextLine());
                    break;
                case 2:
                    System.out.print("수정할 나이를 입력하세요: ");
                    modifiedMember.setAge(sc.nextInt());
                    break;
                case 3:
                    System.out.print("수정할 취미를 입력하세요: ");
                    modifiedMember.setHobbies(resetHobbies());
                    break;
                case 4:
                    System.out.print("수정할 혈액형을 입력하세요: ");
                    modifiedMember.setBloodType(resetBloodType());
                    break;
                case 5:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return selected;
                default:
                    System.out.println("번호를 다시 제대로 입력해 주세요: ");
            }

            return modifiedMember;
}
    }

    private static BloodType resetBloodType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch(bloodType) {
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O;
        }
        return bt;
    }

    private static String[] resetHobbies() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 취미 개수를 입력하세요(숫자로 1 이상 : ");
        int length = sc.nextInt();

        String[] hobbies = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.print((i+1)+ "번째 취미를 입력하세요 : ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        return hobbies;
    }

    private static Member signUp() {
        Member newMember;

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("입력 할 취미 개수를 입력하세요(숫자로 1 이상): ");
        int length = sc.nextInt();
        sc.nextLine();          // 버퍼의 개행문자 처리용

        String[] hobbies = new String[length];
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print((i + 1) + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        System.out.print("혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch(bloodType) {
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O;
        }

        newMember = new Member(id, pwd,age, hobbies);
        newMember.setBloodType(bt);
        /*
        * 회원으로부터 회원가입을 위한 정보를 입력받아 Member 타입 객체 하나로 가공 처리할 방법이 두 가지가 있다.
        * 1.생성자 방식 (장점 : 한줄코딩 / 단점 : 따로 생성자 추가 및 생성자의 매개변수가 다소 늘어날 수 있음__리팩토링 강조)
        * 2.setter 방식 (장점: 초기화 할 개수 수정 용이, 가독성 좋음 / 단점 : 코드의 줄 수가 늘어남)
        * */
        return newMember;
    }

    private static int chooseMemNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호를 입력하세요 : ");
        return sc.nextInt();
    }


}
