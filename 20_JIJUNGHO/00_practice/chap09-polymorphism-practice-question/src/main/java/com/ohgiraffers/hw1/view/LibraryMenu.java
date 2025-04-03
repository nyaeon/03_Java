package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.modal.dto.*;

import java.util.Scanner;

public class LibraryMenu {

    LibraryManager manager = new LibraryManager();
    Scanner sc = new Scanner(System.in);
    Member member = new Member();

    public void mainMenu() {

        int choice = 0;

        System.out.print("이름 : ");
        member.setName(sc.next());
        System.out.print("나이 : ");
        member.setAge(sc.nextInt());
        System.out.print("성별 : ");
        member.setGender(sc.next().charAt(0));

        manager.insertMember(member);

        String menu = """
                ========= 메뉴 ============
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                """;
        do {
            System.out.println(menu);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(manager.myInfo());
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
                default:
                    System.out.println("잘못된 번호를 입력했습니다.");
            }
        } while (choice != 0);
    }

    public void selectAll() {
        Book[] books = manager.selectAll();

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(i + "번 도서 : " + books[i].toString());
            }
        }
    }

    public void searchBook() {
        System.out.println("검색할 제목 키워드 입력 : ");
        String keyword = sc.next();
        Book[] books = manager.searchBook(keyword);

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(i + "번 도서 : " + books[i].toString());
            }
        }
    }

    public void rentBook() {
        int index = 0;

        selectAll();

        System.out.println("대여할 도서 번호 선택 : ");
        index = sc.nextInt();

        int result = manager.rentBook(index);

        if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.마이페이지를 통해 확인해보세요.");
        } else {
            System.out.println("성공적으로 대여되었습니다.");
        }
    }

}
