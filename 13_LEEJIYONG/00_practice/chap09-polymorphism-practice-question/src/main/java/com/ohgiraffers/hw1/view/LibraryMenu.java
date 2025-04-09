package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;
import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm;
    private Scanner sc;

    public LibraryMenu() {
        this.lm = new LibraryManager();
        this.sc = new Scanner(System.in);
    }

    public void mainMenu() {
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이을 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);

        lm.insertMember(new Member(name, age, gender));

        String output = """
            ==== 메뉴 ====
            1. 마이페이지
            2. 도서 전체 조회
            3. 도서 검색
            4. 도서 대여하기
            0. 프로그램 종료하기
            숫자를 입력하세요 : """;

        while (true) {
            System.out.print(output);
            int num = sc.nextInt();
            sc.nextLine();

            if (num == 1) {
                System.out.println(lm.myInfo());
            } else if (num == 2) {
                selectAll();
            } else if (num == 3) {
                searchBook();
            } else if (num == 4) {
                rentBook();
            } else if (num == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못입력했습니다.");
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bList.length; i++) {
            Book book = bList[i];
            sb.append(i).append("번도서 : ");
            sb.append(book.toString()).append("\n");
        }

        System.out.println(sb);
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드를 입력하세요 : ");
        String keyword = sc.nextLine();
        Book[] bList = lm.searchBook(keyword);
        for (Book book : bList) {
            System.out.println(book);
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서번호 입력 : ");
        int num = sc.nextInt();
        sc.nextLine();

        int res = lm.rentBook(num);
        if (res == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (res == 1) {
            System.out.println("나이 제한으로 대여 불가능합니다.");
        } else if (res == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n"
                + "마이페이지를 통해 확인하세요");
        } else {
            System.out.println("오류발생");
        }
    }
}
