package com.ohgiraffers.hw1.model.dto;

public class BookDTO {

    private int bNo;
    private int cateory;
    private String title;
    private String author;

    public BookDTO() {
    }

    public BookDTO(int bNo, int cateory, String title, String author) {
        this.bNo = bNo;
        this.cateory = cateory;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCateory() {
        return cateory;
    }

    public void setCateory(int cateory) {
        this.cateory = cateory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "[" +
                "도서번호 =" + bNo +
                ", 카테고리 =" + cateory +
                ", 제목 ='" + title + '\'' +
                ", 저자 ='" + author + '\'' +
                ']';
    }
}
