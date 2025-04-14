package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.AscBoardNo;

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
        while(true) {
            System.out.println(menu);
            int menuNo = sc.nextInt();
            switch (menuNo) {
                case 1: bm.insertBoard(ib.inputBoard()); break;
                case 2: bm.selectAllList(); break;
                case 3: bm.selectOneBoard(ib.inputBoardNo()); break;
                case 4: bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle()); break;
                case 5: bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent()); break;
                case 6: bm.deleteBoard(ib.inputBoardNo()); break;
                case 7: bm.searchBoard(ib.inputBoardTitle()); break;
                case 8: sortSubMenu(); break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("번호를 다시 입력해주세요.");
            }
        }



    }

    public void sortSubMenu() {
        String boardMenuArranged = """
                ***** 게시글 정렬 메뉴 *****
                1. 글번호순 오름차순 정렬
                2. 글번호순 내림차순 정렬
                3. 작성날짜순 오름차순 정렬
                4. 작성날짜순 내림차순 정렬
                5. 글제목순 오름차순 정렬
                6. 글제목순 내림차순 정렬
                7. mainMenu() 메소드로 이동
                메뉴 번호 선택 :  """;
        while(true) {
            System.out.println(boardMenuArranged);
            int menuNo = sc.nextInt();
            switch (menuNo) {
                case 1 : bm.sortList(new AscBoardNo()); break;
                case 2 : break;
                case 3 : break;
                case 4 : break;
                case 5 : break;
                case 6 : break;
                case 7 :
                    System.out.println("mainMenu로 돌아갑니다.");
                    return;
                default:
                    System.out.println("번호를 다시 입력해주세요.");
            }
        }
    };
}

