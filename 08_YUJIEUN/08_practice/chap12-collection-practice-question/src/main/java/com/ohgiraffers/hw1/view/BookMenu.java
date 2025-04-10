package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm;

    public BookMenu() {
        bm = new BookManager();
    }

    public void menu(){



            System.out.println("""
                    *** 도서 관리 프로그램 ***
                    1. 새 도서 추가
                    2. 도서정보 정렬 후 출력
                    3. 도서 삭제
                    4. 도서 검색출력
                    5. 전체 출력
                    6. 끝내기
                    """);

            sc = new Scanner(System.in);


            while(true) {
                switch(sc.nextInt()) {
                    case 1:
                        bm.addBook(inputBook());
                        break;
                        // addBook (inputBook()이 리턴한 객체) 실행

                    case 2:
                        System.out.println("정렬 방식을 선택해주세요 (1. 오름차순, 2. 내림차순): ");
                        int sortOption = sc.nextInt();
                        sc.nextLine();

                        ArrayList<BookDTO> sortedList = bm.sortedBookList(sortOption);

                        if (sortedList == null) {
                            System.out.println("번호를 잘못입력하였습니다.");
                        } else {
                            bm.printBookList(sortedList);
                        }

                        break;
                    // sortedBookList(정렬종류번호) 실행
            //            =>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
            //                    정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
            //                    1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력
            //            => ArrayList<BookDTO> 리턴 받아 printBookList(ArrayList<BookDTO>) 실행
                    case 3:
                        String title = inputBookTitle(); // 삭제할 제목을 입력받음
                        int index = bm.searchBook(title); // 제목으로 인덱스 검색
                        int result = bm.deleteBook(index);
//                    // deleteBook (도서 번호) 실행
//                   => seachBook()메소드를 이용
                        if(result==0){
                            System.out.println("성공적으로 삭제");

                        }else if(result==1){
                         System.out.println("삭제할 글이 존재하지 않음");
                        }
//                 => 결과값 리턴 받아 0일 경우 “성공적으로 삭제”
//                    1일 경우 “삭제할 글이 존재하지 않음”
                        break;
                    case 4:

                       title = inputBookTitle();
                       index = bm.searchBook(title);

                       if(index==-1){
                           System.out.println("조회한 도서가 존재하지 않음");
                       }else{
                           bm.printBook(index);
                       }
                        break;
//                    // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
//                    => index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
//                    -1이 아닐 경우 printBook(index) 출력
                    case 5:

                       bm.displayAll();

                        break;
                        // displayAll() 실행
//                            => 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
//                    아닌 경우는 전체 출력
                    case 6:

                        System.out.println("프로그램을 종료합니다.");
                        return;

                        // main()으로 리턴
//                      메뉴 번호 선택 : >> 입력 받음
                    // 메뉴 화면 반복 실행 처리
                    // 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행
                }
            }

    }

    public BookDTO inputBook(){

        System.out.println("도서 번호 : ");
        int bNo = sc.nextInt();
        // 도서 번호 : >> 임의 값 입

        System.out.println("도서 제목 : ");
        String title = sc.next();
        // "도서 제목 : " >> 입력 받음

        System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        String genre ="";
        // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
        switch(category) {
            case 1 -> genre ="인문";

            case 2 -> genre ="자연과학";

            case 3 -> genre ="의료";

            case 4 ->  genre ="기타";

        }

        System.out.println("도서 저자 : ");
        String author = sc.next();
        // "도서 저자 : " >> 입력 받음


        return new BookDTO(bNo,category,title,author);
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴

    }

    public String inputBookTitle(){

        System.out.println("도서 제목 : ");
        String title = sc.next();
        // “도서 제목 : “ >> 입력 받음 >> 리턴

        return title;

    }
}

