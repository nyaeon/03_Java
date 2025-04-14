package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.Memberservice;

import java.util.Scanner;


public class Application {

    private static final Memberservice ms = new Memberservice();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String menu = """
                =====화원 정보=======
                1.모든 회원 정보
                2.회원 찾기
                3.회원 가입
                4.정보 수정
                5.회원 탈퇴
                9.종료
                메뉴를 선택하세요 :
                """;
        while (true) {
            System.out.print(menu);
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    ms.findAllMembers();
                    break;
                case 2:
                    ms.findMemberBy(chooseMemNo());
                    break;
                case 3:
                    ms.registMember(signUp());
                    break;
                case 4:
                    Member selected = ms.findMemberForMod(chooseMemNo());
                    if (selected == null) continue;
                    ms.modifyMember(reform(selected));
                    break;
                case 5:
                    break;
                case 9:
                    return;
                default:
                    System.out.println("번호 다시 입력");
            }
        }
    }

    private static Member reform(Member selected) {
        Member modifiedMember = selected;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==== 수정 서브 메뉴 ====");
            System.out.println("1. 패스워드");
            System.out.println("2. 나이");
            System.out.println("3. 취미");
            System.out.println("4. 혈액형");
            System.out.println("5. 메인 메뉴로 돌아가기");
            System.out.print("내용을 선택하세요: ");
            int chooseNo = sc.nextInt();
            sc.nextLine();
            switch (chooseNo) {
                case 1:
                    System.out.print("수정 할 아이디를 입력하세요: ");
                    modifiedMember.setId(sc.nextLine());
                    break;
                case 2:
                    System.out.print("수정 할 나이를 입력하세요: ");
                    modifiedMember.setAge(sc.nextInt());
                    break;
                case 3:
                    System.out.print("수정 할 취미를 입력하세요: ");
                    modifiedMember.setHobbies(resetHobbies());
                    break;
                case 4:
                    System.out.print("수정 할 혈액형을 입력하세요: ");
                    modifiedMember.setBloodType(resetBloodType());
                    break;
                case 5:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return selected;
                default:
                    System.out.println("번호를 다시 제대로 입력해 주세요: ");

                    return modifiedMember;
            }

        }
    }
        private static Member signUp() {
            Member newMember = null;

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
            switch (bloodType) {
                case "A":
                    bt = BloodType.A;
                    break;
                case "AB":
                    bt = BloodType.AB;
                    break;
                case "B":
                    bt = BloodType.B;
                    break;
                case "O":
                    bt = BloodType.O;
            }
            /***
             * 회원으로부터 회원가입을 위한 정보를 입력받아 member 타입 객체 하나로 가공 처리할 방법이 두가지가 있다
             * 1.생성자 방식: (장: 한줄 코딩, 단: 따로 생성자 추가 및 생성자의 매개변수가 다소 늘어날 수 있음(리펙토링 징조))
             * 2.setter 방식: (장: 초기화 객수 수정 용이 ,가독성 좋음, 단: 코드의 줄 수가 늘어남)
             */
            newMember = new Member(id, age, pwd, hobbies);

            newMember.setBloodType(bt);
            return newMember;
        }





    private static int chooseMemNo () {
        //회원 ID를 입력받아 반환하는 메소드
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호 입력 : ");
        return sc.nextInt();
    }


    private static String[] resetHobbies() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 취미 개수 입력 : ");
        int length = sc.nextInt();
        sc.nextLine();
        String[] hobbies = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1);
            String input = sc.nextLine();
            hobbies[i] = input;
        }
        return hobbies;
    }
    private static BloodType resetBloodType () {
        Scanner sc = new Scanner(System.in);
        System.out.print("혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch (bloodType) {
            case "A":
                bt = BloodType.A;
                break;
            case "AB":
                bt = BloodType.AB;
                break;
            case "B":
                bt = BloodType.B;
                break;
            case "O":
                bt = BloodType.O;
        }
        return bt;

    }
}
