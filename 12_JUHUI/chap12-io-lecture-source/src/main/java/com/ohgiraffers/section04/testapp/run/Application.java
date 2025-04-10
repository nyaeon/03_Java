package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;

import java.util.Scanner;

public class Application {

    //원래 사용시에는 static를 빼고 private final정도만 사용
    private static final MemberService ms = new MemberService(); // (인스턴스)객체를 생성하면 멤버서비스에 대한 정보를 불러들일 수 있음.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //입력을 위해
        String menu = """
                ============= 회원 관리 프로그램 ============
                1. 모든 회원 정보 보기
                2. 회원 찾기
                3. 회원 가입
                4. 회원 정보수정
                5. 회원 탈퇴
                9. 프로그램 종료
                메뉴를 선택해주세요 : """;

        while (true) {
            System.out.print(menu);
            int input = sc.nextInt(); //메뉴 선택 입력받음

            switch (input) {
                case 1: ms.findAllMembers(); break;
                case 2: ms.findMemberBy(chooseMeNo()); break;
                case 3: ms.registMember(signup());break;
                case 4:
                    Member selected = ms.findMemberForMod(chooseMeNo());
                    if (selected == null) continue;
                    ms.modifyMember(reform(selected));
                    break;
                case 5: ms.removeMember(chooseMeNo()); break;
                case 9: return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }

    }


    // 수정 고르면 띄어야하는 메소드, 선택해서 고르면 repository의 메소드로 연결되어서 넘어감.
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
            }

            return modifiedMember;
        }
    }

    // 혈액형 수정
    private static BloodType resetBloodType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정 할 혈액형을 입력하세요(A, AB, B, O): ");
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

    // 취미 수정
    private static String[] resetHobbies() {
        Scanner sc = new Scanner(System.in);

        System.out.println("수정할 취미 개수를 입력하세요(숫자로 1이상) : ");
        int length = sc.nextInt();
        sc.nextLine();

        String[] hobbies = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.println((i + 1) + "번째 취미를 입력하세요 :");
            String input = sc.nextLine();
            hobbies[i] = input;
        }
        return hobbies;
    }

    // 회원 가입, 여기서 return 값 repository로 넘어가서 연결됨.
    private static Member signup() {
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
        switch(bloodType) {
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O;
        }

        /*
         * 회원으로부터 회원가입을 위한 정보를 입력받아 Member 타입 객체 하나로 가공 처리할 방법이 두가지가 있다.
         * 1. 생성자 방식 : (장점: 한줄코딩, 단점: 따로 생성자 추가 및 생성자의 매개변수가 다소 늘어날 수 있음(리팩토링 징조)
         * 2. setter 방식 : (장점: 초기화 할 갯수 수정 용이, 가독성이 좋음, 단점: 코드의 줄 수가 늘어남)
         */
        newMember = new Member(id,pwd,age,hobbies);

        newMember.setBloodType(bt);

        return newMember;
    }

    // 회원 ID를 입력받아 반환하는 메소드
    private static int chooseMeNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원의 번호를 입력하세요 : ");
        return sc.nextInt();
    }
}

