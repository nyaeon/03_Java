package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class AscBoardTitle implements Comparator<BoardDTO> {

    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {

        int result = 0;

        if(o1.getBoardTitle().compareTo(o2.getBoardTitle()) > 0) {
            result = 1;
        } else if(o1.getBoardTitle().compareTo(o2.getBoardTitle()) < 0) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
