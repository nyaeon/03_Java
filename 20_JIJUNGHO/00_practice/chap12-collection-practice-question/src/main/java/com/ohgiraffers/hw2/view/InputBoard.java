package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    Scanner sc = new Scanner(System.in);
    BoardDTO boardDTO = new BoardDTO();

    public BoardDTO inputBoard() {
        // 게시글 등록
        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
        // 날짜는 따로 입력받지않고 현재날짜로 등록
        BoardDTO board  = new BoardDTO();

        System.out.print("글 제목 : ");
        board.setBoardTtile(sc.nextLine());
        System.out.print("작성자 : ");
        board.setBoardWriter(sc.nextLine());
        System.out.print("글 내용(exit입력시 종료) : ");
        String content = sc.nextLine();
        if (content.contains("exit")) return null;
        board.setBoardContent(content);
        board.setBoardDate(new Date());

        return board;
    }

    public int inputBoardNo () {
        System.out.print("게시글 번호를 입력하세요: ");
        return sc.nextInt();
    }

    public String inputBoardTitle() {
        // 제목을 입력받아서 리턴
        System.out.print("제목 입력 : ");
        return sc.nextLine();
    }

    public String inputBoardContent() {
        // 내용을 입력받아서 리턴
        sc.nextLine();
        System.out.print("수정할 내용 입력 : ");
        return sc.nextLine();
    }

}
