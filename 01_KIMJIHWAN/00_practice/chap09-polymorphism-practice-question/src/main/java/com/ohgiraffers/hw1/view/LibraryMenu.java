package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    LibraryManager lm;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        System.out.print("회원의 이름은: ");
        String name = sc.next();
        System.out.print("회원의 나이는: ");
        int age = sc.nextInt();
        System.out.print("회원의 성별은: ");
        char gender = sc.next().charAt(0);
        sc.next().charAt(0);
        Member mem = new Member(name, age, gender);

        // LibraryManager의 insertMember() 메소드에 전달
        lm.insertMember(mem);

        // 무한 반복 실행

        boolean flag = true;
        do {
            System.out.print(
                    """
                            ==== 메뉴 ====
                            1. 마이페이지
                            2. 도서 전체 조회
                            3. 도서 검색
                            4. 도서 대여하기
                            0. 프로그램 종료하기
                            번호 입력 : 
                            """);

            // LibraryManager의 myInfo() 호출하여 출력
            // LibraryMenu의 selectAll() 호출
            // LibraryMenu의 searchBook() 호출
            // LibraryMenu의 rentBook() 호출
            int a = 0;
            switch (a) {
                case 1:
                    lm.myInfo();
                    break;
                case 2:
                    lm.selectAll();
                    break;
                case 3:
                    lm.searchBook();
                    break;
                case 4:
                    lm.rentBook();
                case 0:
                    flag = false;
                    break;
                default:
                    break;
            }
        } while (flag);
    }

    public void selectAll() {
        // LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
        Book[] bList = lm.selectAll();

        // for문 이용하여 bList의 모든 도서 목록 출력
        // 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
        // ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
        for (int i = 0; i > bList.length; i++) {
            System.out.println(i + "번도서 : " + bList[i]);
        }
    }

    public void searchBook() {
        // “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
        System.out.print("검색할 제목 키워드: ");
        String keyword = sc.next();
        lm.searchBook(keyword);

        // LibraryManager의 searchBook() 에 전달
        // 그 결과 값을 Book[] 자료형에 담기
        Book[] searchList = lm.searchBook(keyword);

        // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력

        for (Book books : searchList) {
            // NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
            if (books != null);
            System.out.println(books);
        }

    }
    public void rentBook() {
        // 전체 도서 목록 조회 메소드를 다시 한번 호출하자
        selectAll();

        // 도서전체 조회를 통해 도서들의 번호를 알아봤을 것이다.
        // 따라서 도서 대여는 도서번호를 통해 입력받도록 하자
        System.out.print("대여할 도서 번호 : ");
        int index = sc.nextInt();

        // lm의 rentBook() 메소드에 index 전달
        // 성공적으로 대여 됐는지 결과값 result 받기
        int result = lm.rentBook(index);

        // result가 0인 경우 성공적으로 대여
        // result가 1인 경우 나이제한으로 대여 실패
        // result가 2인 경우 성공적으로 대여 & 요리학원 쿠폰 발급 성공

//        System.out.print("대여할 도서 번호 선택: ");
        int a = lm.rentBook(sc.nextInt());
//
        switch (a) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다");
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");
        }

    }
}

