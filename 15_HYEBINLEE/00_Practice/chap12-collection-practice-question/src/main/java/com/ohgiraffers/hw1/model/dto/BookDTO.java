package com.ohgiraffers.hw1.model.dto;

public class BookDTO {

  int bNo;
  int cateogry;
  String title;
  String author;

  public BookDTO() {
  }

  public BookDTO(int cateogry, String title, String author) {
    this.cateogry = cateogry;
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString() {
    return "BookDTO{" +
        "bNo=" + bNo +
        ", cateogry=" + cateogry +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        '}';
  }

  public int getbNo() {
    return bNo;
  }

  public void setbNo(int bNo) {
    this.bNo = bNo;
  }

  public int getCateogry() {
    return cateogry;
  }

  public void setCateogry(int cateogry) {
    this.cateogry = cateogry;
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
