package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.time.LocalDate;
import java.util.Scanner;

public class InputBoard {

    private Scanner sc  = new Scanner(System.in);


    public BoardDTO inputBoardDTO() {

        //글제목,작성자,를 입력받고,글내용도 입력을 받는다.
        System.out.println("글제목 : ");
        String title = inputBoardTitle();

        System.out.println("작성자 : ");
        String writer = sc.nextLine();

        System.out.println("글내용 : (exit입력시 종료)");
        String content = inputBoardContent();

        //게시글 등록: BoardDTO객체를 생성하여
        //날짜는 현재날짜로 등록
        return new BoardDTO(0,title,writer,LocalDate.now(),content,0);

    }

    public int inputBoardNo() {

        int num = sc.nextInt();
        sc.nextLine(); // 남은 개행 문자 제거
        return num;

    }

    public String inputBoardTitle(){
        // 제목을 입력받아 리턴
        return sc.nextLine();
    }

    public String inputBoardContent(){
        // 내용을 입력받아 리턴
        StringBuilder sb = new StringBuilder();
        String line;

        //글작성은 한번 입력 받을때마다 줄바꿈적용, “exit”키워드를 입력받으면 글작성을 종료한다.
        while(!(line = sc.nextLine()).equalsIgnoreCase("exit") ){
            sb.append(line).append("\n");
        }

        return sb.toString();
    }
}
