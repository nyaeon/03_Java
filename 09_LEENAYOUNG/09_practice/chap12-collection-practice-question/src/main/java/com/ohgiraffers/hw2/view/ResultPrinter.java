package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {

    public void printAllList(ArrayList<BoardDTO> list) {}

    public void printBoard(BoardDTO b) {}

    public void errorPage(String msg) {}

    public void successPage(String msg) {
        // 전달받은 문자열에 따라서 실패내용 출력
        System.out.println(msg);

    }

    public void noSearchResult() {}

}
