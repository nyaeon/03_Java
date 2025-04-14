package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;

public class BoardManager {
    private final ArrayList<BoardDTO> boardList = new ArrayList<>();
    private final ResultPrinter rp = new ResultPrinter();

    public void insertBoard(BoardDTO board) {
        boardList.add(board);
    }


}
