package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        // 회원 이름, 나이, 성별 입력받아
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        sc.nextLine(); // 버퍼 제거

        // LibraryManager의 insertMember 메소드로 전달
        lm.insertMember(new Member(name, age, gender));

        // 무한 반복 메뉴 출력
        String menuText = """
                ==== 메뉴 ====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                메뉴 입력 : """;

        while (true) {
            System.out.print(menuText);
            int menuNum = sc.nextInt();
            sc.nextLine();

            switch (menuNum) {
                case 1:
                    System.out.println(lm.myInfo().toString());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("없는 메뉴. 다시 입력해주세요. \n");
            }
        }

    }

    public void selectAll() {
        // void LibraryManager의 selectAll 메소드 호출
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번도서 : " + bList[i].toString());
            // 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
        }
    }

    public void searchBook() {
        // “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();

        // LibraryManager의 searchBook() 에 전달, 그 결과 값을 Book[] 자료형에 담기
        Book[] searchList = lm.searchBook(keyword);

        // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
        for (Book book : searchList) {
            // NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
            if (book == null) continue;
            System.out.println(book.toString());
        }

    }

    public void rentBook() {

        // 도서대여를 위해 도서번호를 알아야된다. → selectAll() 메소드 호출
        selectAll();
        // “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
        System.out.print("대여할 도서 번호 선택 : ");
        int rentNum = sc.nextInt();

        // LibraryManager의 rentBook() 에 전달, 그 결과 값을 result로 받고 그 result가
        int result = lm.rentBook(rentNum);

        // 0일 경우 → “성공적으로 대여되었습니다.” 출력
        // 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
        // 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
        //            마이페이지를 통해 확인하세요” 출력
        if (result == 0) System.out.println("성공적으로 대여되었습니다.");
        if (result == 1) System.out.println("나이 제한으로 대여 불가능입니다.");
        if (result == 2) System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다."
                + "\n마이페이지를 통해 확인하세요");
    }
}
