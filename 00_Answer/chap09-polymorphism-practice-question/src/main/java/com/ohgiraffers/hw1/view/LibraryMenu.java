package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        // LibraryManager의 insertMember() 메소드에 전달
        //==== 메뉴 ==== // 무한 반복 실행
        //        1. 마이페이지                  // LibraryManager의 myInfo() 호출하여 출력
        //        2. 도서 전체 조회             // LibraryMenu의 selectAll() 호출
        //        3. 도서 검색                  // LibraryMenu의 searchBook() 호출
        //        4. 도서 대여하기              // LibraryMenu의 rentBook() 호출
        //        0. 프로그램 종료하기

        int input = 0;
        String menu = """
                ==== 메뉴 ====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료
                메뉴 선택 : """;
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이을 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);

        lm.insertMember(new Member(name, age, gender));

        do {
            System.out.print(menu);
            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    System.out.println(lm.myInfo());
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
                    System.out.println("잘못된 번호를 입력했습니다.");
                    break;
            }
        }

        while (input != 0);
    }

    public void selectAll() {
        // LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
        // ➔ Book[] bList = lm.selectAll();
        // for문 이용하여 bList의 모든 도서 목록 출력
        // 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
        // ex )0 번도서:
        // 백종원의 집밥 /백종원 / tvN / true
        lm.selectAll();
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + " 번도서 : " + bList[i].toString());
        }
    }

    public void searchBook() {
        // “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
        // LibraryManager의 searchBook() 에 전달
        // 그 결과 값을 Book[] 자료형에 담기
        // ➔ Book[] searchList = lm.searchBook(keyword);
        // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
        // NullPointerException 발생 시 오류 해결하시오 ㅎㅎ

        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();

        Book[] searchBook = lm.searchBook(keyword);

        for (Book book : searchBook) {
            if (book != null) {
                System.out.println(book);
            }
        }

    }

    public void rentBook() {
        // 도서대여를 위해 도서번호를 알아야된다. → selectAll() 메소드 호출
        // “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
        // LibraryManager의 rentBook() 에 전달
        // 그 결과 값을 result로 받고 그 result가
        // 0일 경우 → “성공적으로 대여되었습니다.” 출력
        // 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
        // 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
        // 마이페이지를 통해 확인하세요” 출력

        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);

        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이제한으로 대여 불가능입니다.");
        } else {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
        }

    }


}
