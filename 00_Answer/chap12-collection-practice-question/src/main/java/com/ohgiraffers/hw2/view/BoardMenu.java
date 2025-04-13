package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.comparator.*;
import com.ohgiraffers.hw2.controller.BoardManager;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm = new BoardManager();
    private InputBoard ib = new InputBoard();

    public void mainMenu() {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("******* 게시글 서비스 프로그램 *******");
            System.out.println("1. 게시글 쓰기");
            System.out.println("2. 게시글 전체 보기");
            System.out.println("3. 게시글 한개 보기");
            System.out.println("4. 게시글 제목 수정");
            System.out.println("5. 게시글 내용 수정");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 게시글 제목 검색");
            System.out.println("8. 정렬하기");
            System.out.println("9. 끝내기");

            System.out.print("메뉴 번호 선택 : ");
            int num = sc.nextInt();

            switch(num) {
                case 1 : bm.insertBoard(ib.inputBoard()); break;
                case 2 : bm.selectAllList(); break;
                case 3 : bm.selectOneBoard(ib.inputBoardNo()); break;
                case 4 : bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle()); break;
                case 5 : bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent()); break;
                case 6 : bm.deleteBoard(ib.inputBoardNo()); break;
                case 7 : bm.searchBoard(ib.inputBoardTitle()); break;
                case 8 : sortSubMenu(); break;
                case 9 : System.out.println("프로그램이 종료되었습니다."); return;
            }
        }
    }

    public void sortSubMenu() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("****** 게시글 정렬 메뉴 ******");
            System.out.println("1. 글번호순 오름차순 정렬");
            System.out.println("2. 글번호순 내림차순 정렬");
            System.out.println("3. 작성날짜순 오름차순 정렬");
            System.out.println("4. 작성날짜순 내림차순 정렬");
            System.out.println("5. 글제목순 오름차순 정렬");
            System.out.println("6. 글제목순 내림차순 정렬");
            System.out.println("7. 이전 메뉴로 이동");

            System.out.print("메뉴 번호 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1: bm.sortList(new AscBoardNo()); break;
                case 2: bm.sortList(new DescBoardNo()); break;
                case 3: bm.sortList(new AscBoardDate()); break;
                case 4: bm.sortList(new DescBoardDate()); break;
                case 5: bm.sortList(new AscBoardTitle()); break;
                case 6: bm.sortList(new DescBoardTitle()); break;
                case 7: return;
            }

        }

    }

}
