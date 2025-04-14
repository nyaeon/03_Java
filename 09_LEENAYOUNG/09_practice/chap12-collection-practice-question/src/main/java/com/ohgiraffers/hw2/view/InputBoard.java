package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    public BoardDTO inputBoard() {
        // 게시글 등록
        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
        // 날짜는 따로 입력받지않고 현재날짜로 등록
        Scanner sc = new Scanner(System.in);
        BoardDTO boardDTO = new BoardDTO();

        System.out.print("글 제목 : ");
        String boardTitle = sc.nextLine();
        boardDTO.setBoardTitle(boardTitle);

        System.out.print("작성자 : ");
        String boardWriter = sc.nextLine();
        boardDTO.setBoardWriter(boardWriter);

        Date date = new Date();
        boardDTO.setBoardDate(date);

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
        boardDTO.setBoardContent(sb.toString());

        return boardDTO;
    }

    public int inputBoardNo() {
        // 글번호를 입력받아 리턴
        Scanner sc = new Scanner(System.in);
        System.out.print("글 번호 : ");
        int boardNo = sc.nextInt();
        return boardNo;
    }

    public String inputBoardTitle() {
        // 제목을 입력받아 리턴
        Scanner sc = new Scanner(System.in);
        System.out.print("글 제목 : ");
        String boardTitle = sc.nextLine();
        return boardTitle;
    }

    public String inputBoardContent() {
        // 내용을 입력받아 리턴
        Scanner sc = new Scanner(System.in);
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
        return sb.toString();
    }
}
