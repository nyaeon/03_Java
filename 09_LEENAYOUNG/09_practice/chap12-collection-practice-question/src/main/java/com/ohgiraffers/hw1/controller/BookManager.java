package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        // bookList 인스턴스 생성
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        //bookList에 도서 추가
        bookList.add(book);
    }

    public void deleteBook(int index) {
        //전달받은 index로 삭제
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getbNo() == index) {
                bookList.remove(i);
                System.out.println("해당 도서가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 도서 번호는 존재하지 않습니다.");
    }

    public int searchBook(String bTitle) {
        //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(bTitle)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        // index에 해당하는 객체 출력
        // 조회한 도서가 없을 경우 “조회한 도서가 존재하지 않음”출력
        if(index == -1) {
            System.out.println("조회한 도서가 존재하지 않음");
        } else {
            System.out.println(bookList.get(index));
        }
    }

    public void displayAll() {
        // 도서 전체 리스트를 출력
        // 출력할 도서가 없을 경우 “출력할 도서가 없습니다”라고 출력
        if (bookList.size() > 0) {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        } else {
            System.out.println("출력할 도서가 없습니다.");
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        // 전달받은 매개변수의 값에 따라 정렬(1. 오름차순,2. 내림차순)
        // 해당 배열 주소 값 리턴
        if (select == 1) {
            bookList.sort(new AscCategory());
        } else {
            bookList.sort(new DescCategory());
        }

        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        // 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
        for (BookDTO book : br) {
            System.out.println(book);
        }
    }
}
