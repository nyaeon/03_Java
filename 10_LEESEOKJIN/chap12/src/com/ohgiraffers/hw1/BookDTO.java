package com.ohgiraffers.hw1;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}
    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public int getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        var categoryName = switch (category) {
            case 1 -> "인문";
            case 2 -> "자연과학";
            case 3 -> "의료";
            default -> "기타";
        };

        return "번호: " + bNo +
            ", 분류: '" + categoryName + '\'' +
            ", 제목: '" + title + '\'' +
            ", 저자: '" + author + '\'' +
            '}';
    }
}
