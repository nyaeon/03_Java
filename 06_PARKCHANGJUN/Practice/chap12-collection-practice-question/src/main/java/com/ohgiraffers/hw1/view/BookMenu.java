package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // 1. 새 도서 추가
                    bm.addBook(inputBook());
                    break;
                case 2:
                    // 2. 도서정보 정렬 후 출력
                    System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순) : ");
                    int index = sc.nextInt();
                    if (index == 1 || index == 2) {
                        ArrayList<BookDTO> sortedBookList = bm.sortedBookList(index);
                        bm.printBookList(sortedBookList);
                    } else {
                        System.out.println("번호를 잘못입력하였습니다");
                    }
                    break;
                case 3:
                    // 3. 도서 삭제
                    String title = inputBookTitle();
                    index =  bm.searchBook(title);
                    if (index >= 0) {
                        bm.deleteBook(index);
                        System.out.println("성공적으로 삭제했습니다.");
                    } else {
                        System.out.println("삭제할 도서가 존재하지 않습니다.");
                    }
                    break;
                case 4:
                    // 4. 도서 검색출력
                    title = inputBookTitle();
                    System.out.println(title);
                    index =  bm.searchBook(title);
                    if (index >= 0) {
                        bm.printBook(index);
                    } else {
                        System.out.println("조죄한 도서가 존재하지 않습니다.");
                    }
                    break;
                case 5:
                    // 5. 전체 출력
                    bm.displayAll();
                    break;
                case 6:
                    // 6. 끝내기
                    return;
            }
        }
    }

    public BookDTO inputBook() {
        // BookDTO BookDTO 객체의 필드 값을 키보드로 입력 받아 초기화 하고 객체 리턴

        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine(); // 버퍼 제거
        System.out.print("도서 제목 : ");
        String bTitle = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int selectedNo = sc.nextInt();
        sc.nextLine(); // 버퍼 제거
        System.out.print("도서 저자 : ");
        String bAuthor = sc.nextLine();
        System.out.println(new BookDTO(bNo, selectedNo, bTitle, bAuthor));
        return new BookDTO(bNo, selectedNo, bTitle, bAuthor);
    }

    public String inputBookTitle() {
        // String 검색할 도서제목을 키보드로 입력 받아 리턴
        sc.nextLine(); // 버퍼 제거
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }
}