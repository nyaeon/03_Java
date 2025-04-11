package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    public BoardDTO inputBoard() {

        Scanner sc = new Scanner(System.in);

        System.out.println("새 게시글 쓰기 입니다.");

        BoardDTO b = new BoardDTO();

        System.out.print("글 제목 : ");
        String title = sc.nextLine();
        b.setBoardTitle(title);

        System.out.print("작성자 : ");
        String writer = sc.nextLine();
        b.setBoardWriter(writer);

        Date date = new Date();
        b.setBoardDate(date);

        System.out.print("글 내용(exit 입력 시 종료) : ");
        String content = "";

        while(true) {
            String str = sc.nextLine();

            if(str.equals("exit")) {
                break;
            }

            content += str + "\n";
        }

        b.setBoardContent(content);


        return b;
    }

    public int inputBoardNo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("글 번호를 입력하세요 : ");

        return sc.nextInt();
    }

    public String inputBoardTitle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("제목을 입력하세요 : ");

        return sc.nextLine();
    }

    public String inputBoardContent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("내용을 입력하세요 : ");

        return sc.nextLine();
    }
}
