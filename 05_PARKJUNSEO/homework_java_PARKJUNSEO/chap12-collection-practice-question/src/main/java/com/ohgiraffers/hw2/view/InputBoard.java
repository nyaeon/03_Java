package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    Scanner sc = new Scanner(System.in);

    public BoardDTO inputBoard() {
        System.out.println("글 제목을 입력해주세요.");
        String boardTitle = sc.nextLine();
        System.out.println("작성자 이름을 입력해주세요.");
        String boardWriter = sc.nextLine();
        Date boardDate = new Date();
        System.out.println("======= 글 내용 =======");
        String boardContent = sc.nextLine();
        int readCount = 0;

        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardDate, boardContent, readCount);
        return boardDTO;
    };

    public int inputBoardNo() {
        return 0;
    };

    public String inputBoardTitle() {
        return null;
    };

    public String inputBoardContent() {
        return null;
    };

}
