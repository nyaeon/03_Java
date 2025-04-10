package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp;

    public void insertBoard(BoardDTO b){};

    public void slectAllList() {};

    public void selectOneBoard(int boardNo){};

    public void updateBoardTitle(int boardNo, String title){};

    public void updateBoardContent(int boardNo, String contente){};

    public void deleteBoard(int boardNo){};

    public void selectBoard(String title){};

    public void sortList (Comparator<BoardDTO> c) {};




}
