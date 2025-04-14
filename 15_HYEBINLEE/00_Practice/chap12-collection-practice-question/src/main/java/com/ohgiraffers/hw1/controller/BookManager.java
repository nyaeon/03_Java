package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.ArrayList;
import java.util.Collections;

public class BookManager {

  private ArrayList<BookDTO> bookList;

  public BookManager() {
    bookList = new ArrayList<>();
  }

  public void addBook(BookDTO book) {
    bookList.add(book);
  }

  public void deleteBook(int index) {
    if (index >= 0 && index < bookList.size()) {
      bookList.remove(index);
      System.out.println(index + "번 도서 삭제 성공");
    } else {
      System.out.println("삭제할 도서가 존재하지 않음");
    }
  }

  public int searchBook(String bTitle) {
    for (int i = 0; i < bookList.size(); i++) {
      if (bookList.get(i).getTitle().equals(bTitle)) {
        return i;
      }
    }
    // 해당 제목을 갖는 객체 없으면 -1 반환
    return -1;
  }

  public void printBook(int index) {
    // 자동으로 toString 형변환해서 출력
    System.out.println(bookList.get(index));
  }

  public void displayAll() {
    for (int i = 0; i < bookList.size(); i++) {
      System.out.println(bookList.get(i));
    }
    if (bookList.size() == 0) {
      System.out.println("출력할 도서가 없습니다.");
    }
  }

  public ArrayList<BookDTO> sortedBookList(int select) {
    if (select == 1) {
      Collections.sort(bookList, new AscCategory());
    } else if (select == 2) {
      Collections.sort(bookList, new DescCategory());
    }
    return bookList;
  }

  public void printBookList(ArrayList<BookDTO> br) {
    for (BookDTO b : br) {
      System.out.println(b);
    }
  }
}
