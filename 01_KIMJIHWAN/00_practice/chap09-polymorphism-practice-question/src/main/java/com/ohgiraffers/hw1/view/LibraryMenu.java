package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Member;

import java.awt.*;
import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        Member mem = new Member();
        lm = new LibraryManager();
        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
            System.out.print("이름 : ");
            mem.name = mem.setName(sc.next());
            lm.insertMember(nameA);
            System.out.print("나이 : ");
            lm.insertMember(sc.nextInt());
            System.out.print("성별 : ");
            mem.setGender(sc.next().charAt(0));
             = mem.getName();

        // LibraryManager의 insertMember() 메소드에 전달
        // 무한 반복 실행
        // LibraryManager의 myInfo() 호출하여 출력
        // LibraryMenu의 selectAll() 호출
        // LibraryMenu의 searchBook() 호출
        // LibraryMenu의 rentBook() 호출


        text = """
                public void mainMenu() {
                                ==== 메뉴 ====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                
                """;
    }

    public void selectAll() {

    }

    public void searchBook() {

    }

    public void rentBook() {

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
