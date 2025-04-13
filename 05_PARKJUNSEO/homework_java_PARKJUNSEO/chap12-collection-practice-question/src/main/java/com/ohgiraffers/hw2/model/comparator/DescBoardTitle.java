package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

public class DescBoardTitle implements Comparable<BoardDTO> {

    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        int result = 0;
        if (o1.getBoardTitle() > o2.getBoardTitle()) {
            result = 1;
        } else if (o1.getBoardTitle() < o2.getBoardTitle()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}

}