package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.countroller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);

    private BookManager bm = new BookManager();
    int num = 0;

    public BookMenu() {} // 기본 생성자

    public void menu() {
        String str = """
                === 도서 관리 프로그램 ===
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기
                """;
        System.out.println(str);

        do {
            System.out.println("번호를 입력하세요 : ");// 위치 중요. 여기 안에다가 안넣으면 무한 반복임.
            num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    // 새 도서 추가
                    BookDTO book = inputBook(); //입력받은걸 bookDTO의 객체로 넣어줌
                    bm.addBook(book);
                    break;
                case 2:
                    // 도서 정보 정렬 후 출력
                    System.out.println("정렬 방식 선택 (1. 오름차순, 2. 내림차순) : ");
                    int sortOption = Integer.parseInt(sc.nextLine());
                    if (sortOption == 1 || sortOption == 2) {
                        bm.printBookList(bm.sortedBookList(sortOption));
                    } else {
                        System.out.println("잘못된 정렬 방식입니다.");
                    }
                    break;
                case 3:
                    // 도서 삭제
                    System.out.println("삭제할 도서 번호 입력 : ");
                    int index = Integer.parseInt(sc.nextLine());
                    bm.deleteBook(index);
                    break;
                case 4:
                    // 도서 검색 출력
                    String title = inputBookTitle(); // 메소드에서 입력받은 값을 변수에 넣어 저장 후
                    int searchResult = bm.searchBook(title);
                    if (searchResult == -1) {
                        System.out.println("조회한 도서가 존재하지 않습니다.");
                    } else {
                        bm.printBook(searchResult);
                    }
                    break;
                case 5:
                    // 전체 출력
                    bm.displayAll();
                    break;
                case 6:
                    // 끝내기
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
            }
        } while (num != 6);
    }

    public BookDTO inputBook() {
        //BookManager의 addBook으로 가야함. 여기의 리턴한 객체 실행되어야함.

        // 도서 번호 : >> 임의 값 입력
        System.out.println("도서 번호를 입력하세요 : ");
        int bNo = Integer.parseInt(sc.nextLine());

        // "도서 제목 : " >> 입력 받음
        System.out.println("도서 제목을 입력하세요 : ");
        String titile = sc.nextLine();

        // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
        System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타)를 입력하세요 : ");
        int category = Integer.parseInt(sc.nextLine());

        // "도서 저자 : " >> 입력 받음
        System.out.println("도서 저자를 입력하세요 : ");
        String author = sc.nextLine();

        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴

        return new BookDTO(bNo,category,titile, author);
    }

    public String inputBookTitle() {
        // 4번 도서 검색 출력에서 여기서 리턴한 도서 제목이 북매니저의 searchBook에 가서 실행되어야 함.

        // “도서 제목 : “ >> 입력 받음 >> 리턴
        System.out.println("도서 제목을 입력하세요 : ");
        return sc.nextLine();
    }
}

