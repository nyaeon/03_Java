package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.countroller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {
        label :
        while (true) {
        System.out.println("""
                *** 도서 관리 프로그램 ***
                1. 새 도서 추가
                2. 도서 정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색 출력
                5. 전체 출력
                6. 끝내기
                """);
        int choice  = sc.nextInt();
        switch (choice) {
            case 1:
                bm.addBook(inputBook());
                break;
            case 2:
                System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순) : ");
                int select = sc.nextInt();
                if (select == 1||select == 2) {
                    ArrayList<BookDTO> blist = bm.sortedBookList(select);
                    bm.printBookList(blist);
                } else {
                    System.out.println("번호를 잘못 입력하였습니다.");
                }
                break;
            case 3:
                System.out.print("삭제할 도서 번호 입력 : ");
                int deleteIndex = sc.nextInt();
                bm.deleteBook(deleteIndex);
                break;
            case 4:
                int index = bm.searchBook(inputBookTitle());
                if (index == -1) {
                    System.out.print("출력할 도서가 없습니다.");
                } else {
                    bm.printBook(index);
                }
                break;
            case 5:
                bm.displayAll();
                break;
            case 6:
                break label;
        }
        }

    }

    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목 : ");
        String bTitle = sc.nextLine();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int bCategory = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 : ");
        String bAuthor = sc.nextLine();
        BookDTO bDTO = new BookDTO(bNo, bCategory, bTitle, bAuthor);
        return bDTO;
    }

    public String inputBookTitle() {
        System.out.print("검색할 도서 제목 : ");
        String bTitle = sc.next();
        return bTitle;
    }






}
