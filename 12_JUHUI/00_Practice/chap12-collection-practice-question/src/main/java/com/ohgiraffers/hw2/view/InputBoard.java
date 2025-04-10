package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Scanner;

public class InputBoard {

    private Scanner sc = new Scanner(System.in);

    public BoardDTO inputBoard(){
        // 게시글 등록
        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
        // 날짜는 따로 입력받지않고 현재날짜로 등록
        System.out.println("\n === 새 게시글 등록 ===");
        System.out.println("글 제목 : ");
        String title = sc.nextLine();
        System.out.println("작성자 : ");
        String author = sc.nextLine();
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
        return new BoardDTO(title, author, content);
    }

    public int inputBoardNo() {
        //글번호를 입력받아 리턴

    }

    public String inputBoardTitle() {
        // 제목을 입력받아 리턴
    }

    public String inputBoardContent() {
        // 내용을 입력받아 리턴
    }

}
