package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm;

    public BookMenu() {
    }

    public void menu() {
        String menu = """
                *** 도서 관리 프로그램 ***
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기
                메뉴 번호 선택 :""";

        while (true) {
            System.out.print(menu);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: bm.addBook(inputBook()); break;
                case 2:
                    System.out.print("정렬 방식을 선택해주세요 (1. 오름차순, 2.내림차순) : ");
                    int select = sc.nextInt();
                    if (select == 1 || select == 2) {
                        bm.printBookList(bm.sortedBookList(select));
                    } else {
                        System.out.println("번호를 잘못입력하셨습니다.");
                    }
                    break;
                case 3:
                    System.out.print("도서 번호 : ");
                    int index = sc.nextInt();
                    bm.deleteBook(index);
                    break;
                case 4:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 5: bm.displayAll(); break;
                case 6: return;
                default:
                    System.out.println("번호를 잘못입력하셨습니다.");
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        System.out.print("도서 제목 : ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        System.out.print("도서 저자 : ");
        sc.nextLine();
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);
    }

    public String inputBookTitle() {
        System.out.print("도서 제목 : ");
        sc.nextLine();
        String title = sc.nextLine();
        return title;
    }
}
