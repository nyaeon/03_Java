package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    private Scanner sc = new Scanner(System.in);

    public BoardDTO inputBoard(){
        // 게시글 등록
        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
        // 날짜는 따로 입력받지않고 현재날짜로 등록

        BoardDTO board = new BoardDTO();// 사용하려면 객체 생성해야함.
        System.out.println("\n === 새 게시글 등록 ===");

        System.out.println("글 제목 : ");
        //String title = sc.nextLine();
        board.setBoardTitle(sc.nextLine());

        System.out.println("작성자 : ");
        //String author = sc.nextLine();
        board.setBoardWriter(sc.nextLine());

        System.out.println("글 내용 (exit 입력 시 종료) : ");
        StringBuilder contentBuilder = new StringBuilder();
        String line = "";

        while (true) {
            line = sc.nextLine();
            if (line.equals("exit")) {
                break;
            }
            contentBuilder.append(line).append("\n");
        }
        String content = contentBuilder.toString().trim();
        board.setReadCount(0);

        board.setBoardDate(new Date()); // 현재 날짜로 지정

        return board;
    }

    public int inputBoardNo() {
        //글번호를 입력받아 리턴
        System.out.println("글 번호를 입력하세요 : ");
        return sc.nextInt();

    }

    public String inputBoardTitle() {
        // 제목을 입력받아 리턴
        System.out.println("글 제목을 입력하세요 : ");
        sc.nextLine(); // 버퍼 비우기
        return sc.nextLine();
    }

    public String inputBoardContent() {
        // 내용을 입력받아 리턴
        System.out.println("글 내용을 입력하세요 (종료는 'exit' 입력) : ");
        sc.nextLine(); // 버퍼 비우기

        StringBuilder contentBuilder = new StringBuilder();
        String line = "";

        while (!(line = sc.nextLine()).equals("exit")) {
            contentBuilder.append(line).append("\n");
        }
        return contentBuilder.toString();
    }

}
