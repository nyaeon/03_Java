package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    public BoardDTO inputBoard() {
        Scanner sc = new Scanner(System.in);

        System.out.print("글제목  : ");
        String title = sc.nextLine();
        System.out.print("작성자  : ");
        String writer = sc.nextLine();

        StringBuilder content = new StringBuilder();
        while (true) {
            System.out.print("내용(exit 입력시 종료)  : ");
            String input = sc.nextLine();
            if (input.equals("exit")) break;
            content.append(input).append("\n");
        }

        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoardTtile(title);
        boardDTO.setBoardWriter(writer);
        boardDTO.setBoardDate(new Date());
        boardDTO.setBoardContent(content.toString());

        return boardDTO;
    }

    public int inputBoardNo() {
        // 글번호를 입력받아 리턴
        Scanner sc = new Scanner(System.in);
        System.out.print("글번호  : ");
        return sc.nextInt();
    }

    public String inputBoardTitle() {
        // 제목을 입력받아서 리턴
        Scanner sc = new Scanner(System.in);
        System.out.print("제목  : ");
        return sc.nextLine();
    }

    public String inputBoardContent() {
        // 내용을 입력받아서 리턴
        Scanner sc = new Scanner(System.in);
        System.out.print("내용  : ");
        return sc.nextLine();
    }

}
