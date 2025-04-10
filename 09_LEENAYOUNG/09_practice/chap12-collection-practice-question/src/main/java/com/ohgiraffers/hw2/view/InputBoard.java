package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    Scanner sc = new Scanner(System.in);

    public BoardDTO InputBoard() {
        // 게시글 등록
        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
        // 날짜는 따로 입력받지않고 현재날짜로 등록

        System.out.print("글 제목 : ");
        sc.nextLine();
        String boardTitle = sc.nextLine();
        System.out.print("작성자 : ");
        sc.nextLine();
        String boardWriter = sc.nextLine();
        System.out.print("글 내용 : ");
        StringBuilder sb = new StringBuilder();
        while(true) {
            String line = sc.nextLine();
            if(line.equals("exit")) {
                break;
            }
            sb.append(line);
            sb.append("\n");
        }

        return new BoardDTO(0, boardTitle, boardWriter, new Date(), sb.toString(), 0);
    }

    public int InputBoardNo() {}

    public String InputBoardTitle() {}

    public String InputBoardContent() {}
}
