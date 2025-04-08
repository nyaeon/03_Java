package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class Librarymenu {
    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        lm.insertMember(new Member(name, age, gender, 0));
        String menu = """
            ==== 메뉴 ====
            1. 마이페이지
            2. 도서 전체 조회
            3. 도서 검색
            4. 도서 대여하기
            0. 프로그램 종료하기  """;
        while (true) {
            System.out.print(menu);
            int choice = sc.nextInt();
            switch (choice) {
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
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
            }
        }

    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i]);
        }

    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : " );
        String keyword = sc.next();
        Book[] searchList = lm.searchBook(keyword);
        if(searchList[0] == null) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            for( Book book : searchList ) {
            if(book != null) {
                System.out.println(book);
                }
            }
        }
    }

    public void rentBook() {
        lm.selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);
        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n" +
                                    "마이페이지를 통해 확인하세요.");
                break;
            default:
                System.out.println("대여에 실패하였습니다. 번호를 다시 입력하세요.");
                break;
        }
    }
}
