package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class DescBoardDate implements Comparator<BoardDTO> {

    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {

        int result = 0;

        if(o1.getBoardDate().compareTo(o2.getBoardDate()) < 0) {
            result = 1;
        } else if(o1.getBoardDate().compareTo(o2.getBoardDate()) > 0) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
