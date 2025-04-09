package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.AscBoardDate;
import com.ohgiraffers.hw2.model.comparator.AscBoardNo;
import com.ohgiraffers.hw2.model.comparator.AscBoardTitle;
import com.ohgiraffers.hw2.model.comparator.DescBoardDate;
import com.ohgiraffers.hw2.model.comparator.DescBoardNo;
import com.ohgiraffers.hw2.model.comparator.DescBoardTitle;

public class BoardMenu {

    BoardManager bm;
    InputBoard ib;

    public BoardMenu() {
        bm = new BoardManager();
        ib = new InputBoard();
    }

    public void mainMenu() {
        String menu = """
            1. 게시글 쓰기 
            2. 게시글 전체보기 
            3. 게시글 한 개보기 
            4. 게시글 제목 수정 
            5. 게시글 내용 수정 
            6. 게시글 삭제 
            7. 게시글 제목 검색 
            8, 정렬하기 
            9. 끝내기 
            메뉴 번호 선택 : """;

        while (true) {
            System.out.print(menu);
            int n = ib.InputMenu();

            if (n == 1) {
                bm.insertBoard(ib.inputBoard());
            } else if (n == 2) {
                bm.selectAllList();
            } else if (n == 3) {
                bm.selectOneBoard(ib.inputBoardNo());
            } else if (n == 4) {
                bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle());
            } else if (n == 5) {
                bm.updateContent(ib.inputBoardNo(), ib.inputBoardContent());
            } else if (n == 6) {
                bm.deleteBoard(ib.inputBoardNo());
            } else if (n == 7) {
                bm.searchBoard(ib.inputBoardTitle());
            } else if (n == 8) {
                sortSubMenu();
            } else if (n == 9) {
                System.out.println("종료");
                break;
            }

        }

    }

    public void sortSubMenu() {
        String sortMenu = """
             1. 글번호순 오름차순 정렬 
             2. 글번호순 내림차순 정렬
             3. 작성날짜순 오름차순 정렬 
             4. 작성날짜순 내림차순 정렬
             5. 글제목순 오름차순 정렬
             6. 글제목순 내림차순 정렬
             7. mainMenu()메소드로 이동
            메뉴 번호 입력 : """;

        System.out.print(sortMenu);
        int num = ib.InputMenu();
        if (num == 1) {
            bm.sortList(new AscBoardNo());
        } else if (num == 2) {
            bm.sortList(new DescBoardNo());
        } else if (num == 3) {
            bm.sortList(new AscBoardDate());
        } else if (num == 4) {
            bm.sortList(new DescBoardDate());
        } else if (num == 5) {
            bm.sortList(new AscBoardTitle());
        } else if (num == 6) {
            bm.sortList(new DescBoardTitle());
        } else if (num == 7) {
            System.out.println("메인 메뉴로 이동");
        } else {
            System.out.println("잘못된 값입니다. 메인 메뉴로 이동합니다.");
        }
    }
}
