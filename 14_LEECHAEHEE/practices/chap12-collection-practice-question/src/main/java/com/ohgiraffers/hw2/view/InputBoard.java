package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    BoardDTO board = new BoardDTO();
    Scanner sc = new Scanner(System.in);
    public BoardDTO inputBoard() {
        System.out.print("글 제목을 입력하세요 : ");
        board.setBoardTitle(sc.nextLine());
        System.out.print("글 작성자를 입력하세요 : ");
        board.setBoardWriter(sc.nextLine());
        System.out.print("글 내용을 입력하세요 : ");
        String content = sc.nextLine();
        if (content.contains("exit")) {
            return null;
        }
        board.setBoardDate(new Date());
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
