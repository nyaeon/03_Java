package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    Scanner sc;
    BookManager bm;

    public BookMenu() {
        sc = new Scanner(System.in);
        bm = new BookManager();
    }

    public void menu() {
        /*
            *** 도서 관리 프로그램 ***
            1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행
            2. 도서정보 정렬 후 출력 // sortedBookList(정렬종류번호) 실행
             =>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
             정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
             1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력
            => ArrayList<BookDTO> 리턴 받아 printBookList(ArrayList<BookDTO>) 실행
            3. 도서 삭제 // deleteBook (도서 번호) 실행
             => seachBook()메소드를 이용
            => 결과값 리턴 받아 0일 경우 “성공적으로 삭제”
            1일 경우 “삭제할 글이 존재하지 않음”
            4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
             => index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
            -1이 아닐 경우 printBook(index) 출력
            5. 전체 출력 // displayAll() 실행
            => 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
             아닌 경우는 전체 출력
            6. 끝내기 // main()으로 리턴
            메뉴 번호 선택 : >> 입력 받음
            // 메뉴 화면 반복 실행 처리
            // 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행
         */
        String menu = """
            1. 새 도서 추가 
            2. 도서정보 정렬 후 출력 
            3. 도서 삭제 
            4. 도서 검색출력
            5. 전체 출력
            6. 끝내기 
            메뉴 번호 선택 : """;
        while (true) {
            System.out.print(menu);
            int n = sc.nextInt();
            sc.nextLine();

            if (n == 1) {
                bm.addBook(inputBook());
            } else if (n == 2) {
                System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순) : ");
                int i = sc.nextInt();
                sc.nextLine();
                if (i != 1 && i != 2) {
                    System.out.println("번호를 잘못입력하였습니다");
                    continue;
                }
                ArrayList<BookDTO> bookList = bm.sortedBookList(i);
                bm.printBookList(bookList);
            } else if (n == 3) {
                String title = inputBookTitle();
                int index = bm.searchBook(title);
                if (index == -1) {
                    System.out.println("조회한 도서가 존재하지 않음");
                    continue;
                }
                bm.deleteBook(index);
                System.out.println("성공적으로 삭제");
            } else if (n == 4) {
                int index = bm.searchBook(inputBookTitle());
                if (index == -1) {
                    System.out.println("도서가 존재하지 않음");
                    continue;
                }
                bm.printBook(index);
            } else if (n == 5) {
                bm.displayAll();
            } else if (n == 6) {
                System.out.println("종료하겠습니다.");
                break;
            } else {
                System.out.println("올바른 번호를 다시 입력해주세요");
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);
    }

    public String inputBookTitle() {
        System.out.print("도서 제목을 입력하세요 : ");
        return sc.nextLine();
    }
}
