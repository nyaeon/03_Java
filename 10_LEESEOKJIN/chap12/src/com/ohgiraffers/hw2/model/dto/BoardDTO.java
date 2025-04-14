package com.ohgiraffers.hw2.model.dto;

import java.util.Date;

public class BoardDTO {
    private int boardNo;
    private String boardTitle;
    private String boardWriter;
    private Date boardDate;
    private String boardContent;
    private int readCount;

    public BoardDTO() {}
    public BoardDTO(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent, int readCount) {
        this.boardNo = boardNo;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardDate = boardDate;
        this.boardContent = boardContent;
        this.readCount = readCount;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public Date getBoardDate() {
        return boardDate;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public int getReadCount() {
        return readCount;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardNo=" + boardNo +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardDate=" + boardDate +
                ", boardContent='" + boardContent + '\'' +
                ", readCount=" + readCount +
                '}';
    }
}
