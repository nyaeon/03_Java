package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controllor.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {

    private Scanner sc = new Scanner(System.in);
    private BoardManager boardManager = new BoardManager();
    private InputBoard inputBoard = new InputBoard();
    private ResultPrinter resultPrinter = new ResultPrinter();

    public void mainMenu() {
        int choice;

        do {
            System.out.println("\n*** 게시판 관리 프로그램 ***");
            System.out.println("1. 새 게시글 등록");
            System.out.println("2. 게시글 전체 조회");
            System.out.println("3. 게시글 번호로 조회");
            System.out.println("4. 게시글 제목 수정");
            System.out.println("5. 게시글 내용 수정");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 게시글 제목으로 검색");
            System.out.println("8. 게시글 정렬하여 조회");
            System.out.println("9. 종료");
            System.out.print("메뉴를 선택하세요: ");
            choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    boardManager.insertBoard(inputBoard.inputBoard());
                    break;
                case 2:
                    boardManager.selectAllList();
                    break;
                case 3:
                    boardManager.selectOneBoard(inputBoard.inputBoardNo());
                    break;
                case 4:
                    int updateNoTitle = inputBoard.inputBoardNo();
                    String newTitle = inputBoard.inputBoardTitle();
                    boardManager.updateBoardTitle(updateNoTitle, newTitle);
                    break;
                case 5:
                    int updateNoContent = inputBoard.inputBoardNo();
                    String newContent = inputBoard.inputBoardContent();
                    boardManager.updateContent(updateNoContent, newContent);
                    break;
                case 6:
                    boardManager.deleteBoard(inputBoard.inputBoardNo());
                    break;
                case 7:
                    boardManager.searchBoard(inputBoard.inputBoardTitle());
                    break;
                case 8:
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
            }
        } while (choice != 9);

    }

    public sortSubMenu() {
        int choice;

        do {
            System.out.println("\n*** 게시글 정렬 방식 선택 ***");
            System.out.println("1. 글번호 순 (오름차순)");
            System.out.println("2. 글번호 순 (내림차순)");
            System.out.println("3. 작성일 순 (오름차순)");
            System.out.println("4. 작성일 순 (내림차순)");
            System.out.println("5. 제목 순 (오름차순)");
            System.out.println("6. 제목 순 (내림차순)");
            System.out.println("7. 이전 메뉴로 돌아가기");
            System.out.print("정렬 방식을 선택하세요: ");
            choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    boardManager.sortList(new AscBoardNo());
                    break;
                case 2:
                    boardManager.sortList(new DescBoardNo());
                    break;
                case 3:
                    boardManager.sortList(new AscBoardDate());
                    break;
                case 4:
                    boardManager.sortList(new DescBoardDate());
                    break;
                case 5:
                    boardManager.sortList(new AscBoardTitle());
                    break;
                case 6:
                    boardManager.sortList(new DescBoardTitle());
                    break;
                case 7:
                    System.out.println("이전 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
            }
        } while (true);
    }
}
