package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;

    private ResultPrinter rp;

    public void insertBoard(BoardDTO b){
        b.setBoardNo(0);
        if (b.getReadCount() > 0 ) {
            // 조회된 내역이 있는 경우 새로운 리스트 생성
            ArrayList<BoardDTO> arrayList = new ArrayList<>();
            // 미완성
            b.setBoardNo(1);
        } else {
            // 조회내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회
        }
        System.out.println();
    };

    public void selectAllList() {

    };

    public void selectOneBoard(int boardNo){};

    public void updateBoardTitle(int boardNo, String title){};

    public void updateBoardContent(int boardNo, String contente){};

    public void deleteBoard(int boardNo){};

    public void searchBoard(String title){};

    public void sortList (Comparator<BoardDTO> c) {};




}
