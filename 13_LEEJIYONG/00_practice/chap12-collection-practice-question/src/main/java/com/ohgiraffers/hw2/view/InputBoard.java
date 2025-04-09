package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    Scanner sc;

    public InputBoard() {
        this.sc = new Scanner(System.in);
    }

    public int InputMenu() {
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }


    public BoardDTO inputBoard() {
        // 게시글 등록
        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
        // 날짜는 따로 입력받지않고 현재날짜로 등록
        System.out.print("글 제목 입력 : ");
        String title = sc.nextLine();
        System.out.print("작성자 입력 : ");
        String author = sc.nextLine();
        System.out.print("글 내용 입력 : ");
        String content = sc.nextLine();

        return new BoardDTO(0, title, author, new Date(), content, 0);
    }

    public int inputBoardNo() {
        System.out.print("글 번호 입력 : ");
        int bNo = sc.nextInt();
        sc.nextLine();
        return bNo;
    }

    public String inputBoardTitle() {
        System.out.print("글 제목 입력 : ");
        return sc.nextLine();
    }

    public String inputBoardContent() {
        System.out.print("글 내용 입력");
        return sc.nextLine();
    }
}
