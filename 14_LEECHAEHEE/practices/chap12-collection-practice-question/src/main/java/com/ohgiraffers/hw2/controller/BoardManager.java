package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.InputBoard;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {
    ArrayList<BoardDTO> boardList = new ArrayList<>();
    ResultPrinter rp = new ResultPrinter();

    public void insertBoard(BoardDTO b) {
        if (b == null) {
            rp.errorPage("insertboard");
            return;
        }

        if (!boardList.isEmpty()) {
          boardList.add(b);
          b.setBoardNo(1);
        } else {

        }

    }

    public void selectAllList() {
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo) {

    }

    public void updateBoardTitle(int boardNo, String title) {

    }

    public void updateBoardContent(int boardNo, String content) {

    }

    public void deleteBoard(int boardNo) {

    }

    public void searchBoard(String title) {

    }

    public void sortList(Comparator<BoardDTO> c) {

    }
}
