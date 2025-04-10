package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

  Scanner scanner = new Scanner(System.in);
  BookManager bookManager = new BookManager();

  public BookMenu() {
  }

  public void menu() {
    while (true) {
      System.out.println("*** 도서 관리 프로그램 ***");
      System.out.println("1. 새 도서 추가");
      System.out.println("2. 도서정보 정렬 후 출력");
      System.out.println("3. 도서 삭제");
      System.out.println("4. 도서 검색출력");
      System.out.println("5. 전체 출력");
      System.out.println("6. 끝내기");
      System.out.print("메뉴 번호 선택 : ");

      int number = scanner.nextInt();
      switch (number) {
        case 1:
          BookDTO book = inputBook();
          bookManager.addBook(book);
          break;
        case 2:
          System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)");
          int select = 0;
          while (true) {
            select = scanner.nextInt();
            if (select == 1 || select == 2) {
              break;
            }
            System.out.println("번호를 잘못입력하였습니다.");
          }
          ArrayList<BookDTO> list = bookManager.sortedBookList(select);
          bookManager.printBookList(list);
          break;
        case 3:
          System.out.print("삭제할 도서 번호를 입력하세요: ");
          int num = scanner.nextInt();
          bookManager.deleteBook(num);
          break;
        case 4:
          String targetBook = inputBookTitle();
          int index = bookManager.searchBook(targetBook);
          if (index == -1) {
            System.out.println("조회한 도서가 존재하지 않음");
          } else {
            bookManager.printBook(index);
          }
          break;
        case 5:
          bookManager.displayAll();
          break;
        case 6:
          return;
      }
    }
  }

  public BookDTO inputBook() {
    int bNo;
    int category;
    String title;
    String author;

    System.out.print("도서 번호 : ");
    bNo = scanner.nextInt();
    System.out.print("도서 제목 : ");
    title = scanner.next();
    System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
    category = scanner.nextInt();
    System.out.print("도서 저자 : ");
    author = scanner.next();
    BookDTO book = new BookDTO(bNo, category, title, author);
    return book;
  }

  public String inputBookTitle() {
    System.out.print("도서 제목 : ");
    String title = scanner.next();
    return title;
  }
}
