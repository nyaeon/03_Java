package com.ohgiraffers.hw1.model.dto;

public class AniBook extends Book {

  int accessAge;

  public AniBook() {
  }

  public AniBook(String title, String author, String publisher, int accessAge) {
    this.setTitle(title);
    this.setAuthor(author);
    this.setPublisher(publisher);
    this.accessAge = accessAge;
  }

  @Override
  public String toString() {
    return super.toString() + " / " + String.valueOf(accessAge);
  }

  public int getAccessAge() {
    return accessAge;
  }

  public void setAccessAge(int accessAge) {
    this.accessAge = accessAge;
  }
}
