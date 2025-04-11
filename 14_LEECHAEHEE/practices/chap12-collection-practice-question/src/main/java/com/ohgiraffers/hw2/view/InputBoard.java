package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    Scanner sc = new Scanner(System.in);
    public BoardDTO inputBoard() {
        System.out.print("글 제목을 입력하세요 : ");
        String title = sc.next();
        System.out.print("글 작성자를 입력하세요 : ");
        String author = sc.next();
        System.out.print("글 내용을 입력하세요 : ");
        String content = sc.nextLine();
        int boardNo = 0;
        Date boardDate = new Date();
        BoardDTO board = new BoardDTO(boardNo, title, author, boardDate, content, 0);
        return board;
    }

    public int inputBoardNo() {
        System.out.print("글 번호를 입력하세요 : ");
        int num = sc.nextInt();
        return num;
    }

    public String inputBoarTitle() {
        System.out.print("글 제목을 입력하세요 : ");
        String title = sc.next();
        return title;

    }

    public String inputBoardContent() {
        System.out.print("글 내용을 입력하세요 : ");
        String content = sc.nextLine();
        return content;
    }

}
