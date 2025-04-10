package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {


        String menu = """
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기
                """;


        while (true){
            System.out.print(menu + "메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("정렬 방식을 선택해 주세요 (1.오름차순, 2.내림차순) : ");
                    int select = sc.nextInt();
                    if(select == 1 || select == 2){
                        bm.printBookList(bm.sortBookList(select));
                    } else {
                        System.out.println("번호를 잘못 입력하셨습니다.: ");
                    }
                    break;
                case 3:
                    System.out.print("삭제할 도서번호를 입력하세요: ");
                    int index = sc.nextInt();

                    bm.deleteBook(index);

                    break;
                case 4:
                    bm.printBook(bm.searchBook(inputBookTitle()));

                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }


    }

    public void menu(){


    }

    public BookDTO inputBook() {
        BookDTO book = new BookDTO();

        System.out.print("도서 번호 입력 : ");
        int bno = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목 입력 : ");
        String title = sc.nextLine();


        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) 입력 : ");
        int category = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 입력 : ");
        String author = sc.nextLine();

        return new BookDTO(bno, category, title, author);
    }

    public String inputBookTitle() {
        System.out.print("도서 제목 입력 : ");
        return sc.nextLine();
    }
}
