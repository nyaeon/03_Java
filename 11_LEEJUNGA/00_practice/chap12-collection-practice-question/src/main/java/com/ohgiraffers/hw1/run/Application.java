package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.view.BookMenu;

public class Application {
    public static void main(String[] args) {

        // BookMenu 클래스 객체 생성하고 menu() 메소드 실행
        BookMenu bookMenu = new BookMenu();
        bookMenu.menu();
    }
}

//+menu() : void 도서관리 프로그램에 해당하는
//메인 메뉴 출력, 각 메뉴에 해당
//하는 BookManager 클래스의 메
//소드 실행 → 반복 출력되게 한다



//1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행

//2. 도서정보 정렬 후 출력 // sortedBookList(정렬종류번호) 실행
// =>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
//정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
// 1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력
//=> ArrayList<BookDTO> 리턴 받아 printBookList(ArrayList<BookDTO>) 실행

//3. 도서 삭제 // deleteBook (도서 번호) 실행
// => seachBook()메소드를 이용
//=> 결과값 리턴 받아 0일 경우 “성공적으로 삭제”
//        1일 경우 “삭제할 글이 존재하지 않음”

//4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
// => index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
//        -1이 아닐 경우 printBook(index) 출력

//5. 전체 출력 // displayAll() 실행
//=> 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
//아닌 경우는 전체 출력

//6. 끝내기 // main()으로 리턴


//메뉴 번호 선택 : >> 입력 받음

// 메뉴 화면 반복 실행 처리
// 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행


