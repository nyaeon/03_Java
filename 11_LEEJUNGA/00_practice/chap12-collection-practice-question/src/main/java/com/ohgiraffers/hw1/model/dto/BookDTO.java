package com.ohgiraffers.hw1.model.dto;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {
    }


    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        //    필드 값 문자열 합친 후 리턴
        //    category 분류 별로 출력
        //    >> 1 : 인문 / 2 : 자연과학
        //       3 : 의료 / 4 : 기타
        String categoryName = "";
        switch (category) {
            case 1:
                categoryName = "인문";
                break;
            case 2:
                categoryName = "자연과학";
                break;
            case 3:
                categoryName = "의료";
                break;
            case 4:
                categoryName = "기타";
                break;
        }
        return "bNo=" + bNo + ", category=" + categoryName + ", title=" + title + ", author=" + author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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
}
