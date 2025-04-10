package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp;

    /* 새 게시글 등록용 메소드 */
    public void insertBoard(BoardDTO b) {
        // 글번호 0으로 초기화
        b.setBoardNo(0);

        // 출력값 결정(successPage)
        boardList.add(b);
    }

    public void selectAllList() {}

    public void selectOneBoard(int boardNo) {}

    public void updateBoardTitle(int boardNo, String title) {}

    public void updateBoardContent(int boardNo, String content) {}

    public void deleteBoard(int boardNo) {}

    public void searchBoard(String title) {}

    public void sortList(Comparator<BoardDTO> c) {}
}
