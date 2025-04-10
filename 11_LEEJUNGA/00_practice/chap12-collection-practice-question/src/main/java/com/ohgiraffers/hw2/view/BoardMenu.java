package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;
import java.util.Scanner;

//+ mainMenu():void 게시글 서비스 프로그램
//메인 메뉴 출력, 각 메뉴에 해당
//하는 BoardManger클래스의 메소
//        드 실행, 도서에 대한 정보는
//InputBoard클래스의 메소드를 호
//출하여 사용 -> 반복 출력


//+ sortSubMenu() 게시글 정렬메뉴
//(정렬은 오름차순,내림차순)
//정렬대상: 글번호,날짜,제목

public class BoardMenu {
    private BoardManager bm = new BoardManager();
    private InputBoard ib = new InputBoard();


    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        String menuMsg = """
                *** 게시글 서비스 프로그램 ***
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
            System.out.print(menuMsg);
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 제거
            switch (choice) {
                case 1:
                    // 1. 게시글 쓰기
                    BoardDTO boardDTO = ib.inputBoard();
                    bm.insertBoard(boardDTO);
                    break;
                case 2:
                    // 2. 게시글 전체보기
                    bm.selectAllList();
                    break;

                case 3:
                    // 3. 게시글 한 개보기
                    bm.selectOneBoard(ib.inputBoardNo());
                    break;
                case 4:
                    // 4. 게시글 제목 수정
                    bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle());
                    break;
                case 5:
                    // 5. 게시글 내용 수정
                    bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent());
                    break;
                case 6:
                    // 6. 게시글 삭제
                    bm.deleteBoard(ib.inputBoardNo());
                    break;
                case 7:
                    // 7. 게시글 제목 검색
                    bm.searchBoard(ib.inputBoardTitle());
                    break;
                case 8:
                    // 8. 정렬하기
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
            }
        }

    }

    public void sortSubMenu() {
        String menuMsg = """
                ***** 게시글 정렬 메뉴 *****
                1. 글번호순 오름차순 정렬 // sortList(AscBoardNo())
                2. 글번호순 내림차순 정렬 // sortList(DescBoardNo())
                3. 작성날짜순 오름차순 정렬 // sortList(AscBoardDate())
                4. 작성날짜순 내림차순 정렬// sortList(DescBoardDate())
                5. 글제목순 오름차순 정렬 // sortList(AscBoardTitle())
                6. 글제목순 내림차순 정렬 // sortList(DescBoardTitle())
                7. 메인 메뉴로 돌아가기
                메뉴번호를 입력 : """;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(menuMsg);
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 제거
            Comparator<BoardDTO> comparator = new DescBoardDate();
            switch (choice) {
                case 1:
                    // 1. 글번호순 오름차순 정렬
                    comparator = new AscBoardNo();
                    break;
                case 2:
                    // 2. 글번호순 내림차순 정렬
                    comparator = new DescBoardNo();
                    break;
                case 3:
                    // 3. 작성날짜순 오름차순 정렬
                    comparator = new AscBoardDate();
                    break;
                case 4:
                    // 4. 작성날짜순 내림차순 정렬
                    comparator = new DescBoardDate();
                    break;
                case 5:
                    // 글제목순 오름차순 정렬
                    comparator = new AscBoardTitle();
                    break;
                case 6:
                    // 6. 글제목순 내림차순 정렬
                    comparator = new DescBoardTitle();
                    break;
                case 7:
                    // 7. mainMenu()메소드로 이동
                    return;
            }
            bm.sortList(comparator);
        }
    }

}
