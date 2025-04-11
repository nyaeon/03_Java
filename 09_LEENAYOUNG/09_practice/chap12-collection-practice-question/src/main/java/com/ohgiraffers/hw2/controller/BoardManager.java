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

        // 조회내역이 없는 경우
        // 조회된 내역이 있는 경우 새로운 리스트 생성 & 글 번호를 1로 변경
        if (boardList.isEmpty()) {
            boardList = new ArrayList<>();
            b.setBoardNo(1);
        } else {
            // 조회내역이 있는 경우
            // 기존 리스트의 마지막 인덱스의 글번호 조회
            b.setBoardNo(boardList.get(boardList.size()-1).getBoardNo() + 1);
        }

        // 출력값 결정(successPage)
        boardList.add(b);
        rp.successPage("게시글 등록 성공!");
    }

    public void selectAllList() {}

    public void selectOneBoard(int boardNo) {}

    public void updateBoardTitle(int boardNo, String title) {}

    public void updateBoardContent(int boardNo, String content) {}

    public void deleteBoard(int boardNo) {}

    public void searchBoard(String title) {}

    public void sortList(Comparator<BoardDTO> c) {}
}
