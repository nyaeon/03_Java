package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    BookManager manager = new BookManager();
    Scanner sc = new Scanner(System.in);

    public void menu() {

        int input;

        String mainMenu = """
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기
                메뉴 선택 :  """;
        do {
            System.out.print(mainMenu);
            input = sc.nextInt();

            switch (input) {
                case 1:
                    manager.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("1. 오름차순, 2.내림차순 : ");
                    int select = sc.nextInt();
                    ArrayList<BookDTO> sorted = manager.sortedBookList(select);
                    manager.printBookList(sorted);
                    break;
                case 3: {
                    System.out.print("삭제할 도서 번호 : ");
                    int index = sc.nextInt();
                    manager.deleteBook(index);
                    break;
                }
                case 4:
                    String title = inputBookTitle();
                    int index = manager.searchBook(title);
                    if (index == -1) {
                        System.out.println("조회한 도서가 존재하지 않습니다.");
                    } else {
                        manager.printBook(index);
                    }
                    break;
                case 5: manager.displayAll();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("번호를 잘못입력하였습니다");
                    break;
            }
        }
        while (input != 6);

    }

    public BookDTO inputBook() {
        BookDTO book = new BookDTO();
        System.out.print("도서 번호 : ");
        book.setbNo(sc.nextInt());
        sc.nextLine(); // 버퍼 비우기

        System.out.print("도서 제목 : ");
        book.setTitle(sc.nextLine());

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        book.setCategory(sc.nextInt());
        sc.nextLine();

        System.out.print("도서 저자 : ");
        book.setAuthor(sc.nextLine());

        return book;
    }


    public String inputBookTitle() {
        sc.nextLine();
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();

        return title;
    }

}
