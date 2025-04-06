package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        Member mem = new Member();
        System.out.print("회원 이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("성별: ");
        char gender = sc.next().charAt(0);
        mem.setName(name);
        mem.setAge(age);
        mem.setGender(gender);
        lm.insertMember(mem);

        while (true) {
            System.out.println("""
                    1. 마이페이지
                    2. 도서전체조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    """);
            int menuOption = sc.nextInt();
            switch (menuOption) {
                case 1:
                    System.out.println(lm.myinfo());
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
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }
    }

    int count = 0;
    public void selectAll() {
        Book[] blist = lm.selectAll();
        for (int i = 0; i < count+1; i++) {
            System.out.println(i + "번 도서 : " + blist[i].);
            count += 1;
        }
    }

    public void searchBook() {
        System.out.println("검색할 제목 키워드 : ");
        String titlesearch = sc.next();
        Book[] blist = lm.searchBook(titlesearch);
        //for (int num : )
    }

    public void rentBook() {}

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }
}

