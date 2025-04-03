package com.ohgiraffers.hw1.model.view;

import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;
import java.util.Scanner;

public class LibraryMenu {
    private final LibraryManager lm = new LibraryManager();
    private final Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별(M/F): ");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        Member member = new Member(name, age, gender);
        lm.insertMember(member);

        while (true) {
            System.out.println("""
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료
                    메뉴 선택: """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> System.out.println(lm.myInfo());
                case 2 -> selectAll();
                case 3 -> searchBook();
                case 4 -> rentBook();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println((i + 1) + "번 도서: " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드: ");
        String keyword = sc.nextLine();
        Book[] results = lm.searchBook(keyword);
        if (results.length == 0) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (Book b : results) {
                System.out.println(b);
            }
        }
    }

    public void rentBook() {
        Book[] bList = lm.selectAll();
        System.out.print("대여할 도서 번호 선택 (1 ~ " + bList.length + "): ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index < 1 || index > bList.length) {
            System.out.println("잘못된 도서 번호입니다.");
            return;
        }
        int result = lm.rentBook(index - 1);
        switch (result) {
            case 0 -> System.out.println("성공적으로 대여되었습니다.");
            case 1 -> System.out.println("나이 제한으로 대여할 수 없습니다.");
            case 2 -> System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지에서 확인하세요.");
            default -> System.out.println("알 수 없는 오류가 발생했습니다.");
        }
    }
}
