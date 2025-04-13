package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;

import java.util.Scanner;


public class BoardMenu {

    Scanner sc = new Scanner(System.in);

    private BoardManager bm;
    private InputBoard ib;

    public void mainMenu() {
        String menu = """
                *** 게시글 서비스 프로그램 ***
                1. 게시글 쓰기
                2. 게시글 전체보기
                3. 게시글 한개 보기
                4. 게시글 제목 수정
                5. 게시글 내용 수정
                6. 게시글 삭제
                7. 게시글 제목 검색
                8. 정렬하기
                9. 끝내기
                메뉴 번호 선택 : """;
        int menuNo = sc.nextInt();
        while(true) {
            switch (menuNo) {
                case 1: bm.insertBoard(ib.inputBoard()); break;
                case 2: bm.selectAllList(); break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("번호를 다시 입력해주세요.");
            }
        }



    }

    public void sortSubMenu() {};
}

