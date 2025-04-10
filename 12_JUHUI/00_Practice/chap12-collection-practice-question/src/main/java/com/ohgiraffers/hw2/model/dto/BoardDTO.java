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

    public BoardDTO(String boardTitle, String boardWriter, String boardContent) {
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContent = boardContent;
        this.boardDate = new Date(); // 생성 시 현재 날짜로 초기화
        this.readCount = 0;

    }

    public BoardDTO(int boardNo, String boardTitle
            , String boardWriter, Date boardDate, String boardContent, int readCount) {
        this.boardNo = boardNo;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardDate = boardDate;
        this.boardDate = boardDate;
        this.boardContent = boardContent;
        this.readCount = readCount;
    }

    //getter
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
    //setter
    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public void setBoardDate(Date boardDate) {
        this.boardDate = boardDate;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "글 번호 : " + boardNo +
                ", 제목 : '" + boardTitle + '\'' +
                ", 작성자 : " + boardWriter + '\'' +
                ", 작성일 : " + boardDate +
                ", 내용 : " + boardContent + '\'' +
                ", 조회수 :" + readCount +
                '}';
    }
}
