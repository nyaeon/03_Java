package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class AscBoardDate implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        // 등록일 오름차순
        return o1.getBoardDate().compareTo(o2.getBoardDate());
    }
}
