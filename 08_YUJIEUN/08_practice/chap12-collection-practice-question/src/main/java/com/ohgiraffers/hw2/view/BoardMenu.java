package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm;
    private InputBoard ib;


    public void mainMenu(){

        bm = new BoardManager();
        ib = new InputBoard();
        //게시글 서비스 프로그램 메인 메뉴 출력,
        //각 메뉴에 해당하는 BoardManger클래스의 메소드 실행,
        //도서에 대한 정보는 InputBoard클래스의 메소드를 호출하여 사용 -> 반복 출력


        while(true){
            System.out.println(""" 
                            *** 게시글 서비스 프로그램 ***
                            1. 게시글 쓰기
                            2. 게시글 전체보기
                            3. 게시글 한 개보기
                            4. 게시글 제목 수정
                            5. 게시글 내용 수정
                            6. 게시글 삭제
                            7. 게시글 제목 검색
                            8. 정렬하기
                            9. 끝내기
                            메뉴 번호 선택 :
                            """
            );

            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            switch(menu){


                case 1:
                    bm.insertBoard(ib.inputBoardDTO());
                    break;
                case 2:
                    bm.selectAlllist();
                    break;
                case 3:
                    System.out.println("조회할 게시글 번호 입력 : ");
                    int boardNo = ib.inputBoardNo();
                    bm.selectOneBoard(boardNo);
                    break;
                case 4:
                    System.out.println("수정할 게시글 번호 입력 : ");
                    boardNo = ib.inputBoardNo();
                    System.out.println("새 제목 입력 : ");
                    String title = ib.inputBoardTitle();
                    bm. updateBoardTitle(boardNo, title);
                    break;
                case 5:
                    System.out.println("수정할 게시글 번호 입력 : ");
                    boardNo = ib.inputBoardNo();
                    System.out.println("새 내용 입력 : ");
                    String content = ib.inputBoardContent();
                    bm.updateBoardContent(boardNo, content);
                    break;
                case 6:
                    System.out.println("삭제할 게시글 번호 입력 : ");
                    boardNo = ib.inputBoardNo();
                    bm.deleteBoard(boardNo);
                    break;
                case 7:
                    System.out.println("검색할 게시글 제목 입력 : ");
                    title = ib.inputBoardTitle();
                    bm.searchBoard(title);
                    break;
                case 8:
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    return;

            }


        }

    }

    public void sortSubMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ***** 게시글 정렬 메뉴 *****
                1. 글번호순 오름차순 정렬 // sortList(AscBoardNo())
                2. 글번호순 내림차순 정렬 // sortList(DescBoardNo())
                3. 작성날짜순 오름차순 정렬 // sortList(AscBoardDate())
                4. 작성날짜순 내림차순 정렬// sortList(DescBoardDate())
                5. 글제목순 오름차순 정렬 // sortList(AscBoardTitle())
                6. 글제목순 내림차순 정렬 // sortList(DescBoardTitle())
                7. mainMenu()메소드로 이동
        """);

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                bm.sortList(new AscBoardNo());
                break;
            case 2:
                bm.sortList(new DescBoardNo());
                break;
            case 3:
                bm.sortList(new AscBoardDate());
                break;
            case 4:
                bm.sortList(new DescBoardDate());
                break;
            case 5:
                bm.sortList(new AscBoardTitle());
                break;
            case 6:
                bm.sortList(new DescBoardTitle());
                break;
            case 7:
                return;
            default:
                return;
        }


    }



}
