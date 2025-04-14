package com.ohgiraffers.hw1.model.dto;

public class BookDTO {

    private int bNo;       // 도서 번호
    private int category;  // 도서 분류 코드
    private String titile; // 도서 제목
    private String author; //도서 저자

    public BookDTO() {}

    public BookDTO(int bNo, int category, String titile, String author) {
        this.bNo = bNo;
        this.category = category;
        this.titile = titile;
        this.author = author;
    }

    //getter
    public int getbNo() {
        return bNo;
    }

    public int getCategory() {
        return category;
    }

    public String getTitile() {
        return titile;
    }

    public String getAuthor() {
        return author;
    }

    //setter
    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String categgoryName = "";

        switch (category) {
            case 1:
                categgoryName = "인문";
                break;
            case 2:
                categgoryName = "자연과학";
                break;
            case 3:
                categgoryName = "의료";
                break;
            case 4:
                categgoryName = "기타";
                break;
        }
        return "도서번호 : " + bNo + ", 분류 : " + categgoryName + ", 제목 : " + titile + ", 저자" + author;
    }

}
