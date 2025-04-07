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
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        Member mem = new Member(name, age, gender);

        // LibraryManager의 insertMember() 메소드에 전달
        lm.insertMember(mem);

        // 무한 반복 실행
        // LibraryManager의 myInfo() 호출하여 출력
        // LibraryMenu의 selectAll() 호출
        // LibraryMenu의 searchBook() 호출
        // LibraryMenu의 rentBook() 호출

        String text = """
                public void mainMenu() {
                                ==== 메뉴 ====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                번호 입력 : 
                """;

        int a = sc.nextInt();
        do {
            System.out.println(text);

            switch (a) {
                case 1: lm.myInfo();
                break;
                case 2: selectAll();
                break;
                case 3: searchBook();
                break;
                case 4: rentBook();
                case 0: break;
            }
        } while (a != 0);


    }

    public void selectAll() {
        Book[] bList = lm.selectAll();

        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드: ");
        String keyword = sc.next();
        lm.searchBook(keyword);
        Book[] searchList = lm.searchBook(keyword);

        for (String searchs : searchList){
            System.out.println(searchs);
        }
    }

    public void rentBook() {
        selectAll();

        System.out.print("대여할 도서 번호 선택: ");
        int a = lm.rentBook(sc.nextInt());

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

    public LibraryManager getIm() {
        return lm;
    }

    public void setIm(LibraryManager im) {
        lm = lm;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
