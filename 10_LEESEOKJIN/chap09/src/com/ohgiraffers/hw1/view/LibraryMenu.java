package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        registerMember();

        boolean terminate = false;
        while (!terminate) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");

            var input = sc.nextInt();
            switch (input) {
                case 1 -> System.out.println(lm.myInfo());
                case 2 -> selectAll();
                case 3 -> searchBook();
                case 4 -> rentBook();
                case 0 -> terminate = true;
            }
        }
    }

    void selectAll() {
        var books = lm.selectAll();
        for (int i = 0; i < books.length; i++) {
            System.out.println(i + "번 도서: " + books[i]);
        }
    }

    void searchBook() {
        System.out.print("검색할 제목 키워드: ");
        for (var book : lm.searchBook(sc.next())) {
            System.out.println(book);
        }
    }

    void rentBook() {
        System.out.print("대여할 도서 번호: ");
        switch (lm.rentBook(sc.nextInt())) {
            case 0 -> System.out.println("성공적으로 대여되었습니다.");
            case 1 -> System.out.println("나이 제한으로 대여 불가능입니다.");
            case 2 -> System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }
    }

    void registerMember() {
        System.out.println("==== 회원 등록 ====");
        System.out.print("이름: ");
        var name = sc.next();
        System.out.print("나이: ");
        var age = sc.nextInt();
        System.out.print("성별: ");
        var gender = sc.next().charAt(0);
        lm.insertMember(new Member(name, age, gender));
    }
}
