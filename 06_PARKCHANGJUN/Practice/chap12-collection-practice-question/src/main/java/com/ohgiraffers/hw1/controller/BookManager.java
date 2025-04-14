package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager(){
        // bookList 인스턴스 생성
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        //bookList에 도서 추가
        bookList.add(book);
    }
    public void deleteBook(int index){
        //전달받은 index로 삭제
        bookList.remove(index);
    }
    public int searchBook(String title){
        //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getTitle().equals(title)) return i;
        }
        //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
        return -1;
    }
    public void printBook(int index){
        // index에 해당하는 객체 출력
        System.out.println(bookList.get(index));
    }
    public void displayAll(){
        // 도서 없으면 없다고 출력
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            // 도서 전체 리스트를 출력
            for(BookDTO book : bookList){
                System.out.println(book);
            }
        }
    }
    public ArrayList<BookDTO> sortedBookList(int select){
        // 전달받은 매개변수의 값에 따라 정렬(1. 오름차순,2. 내림차순)
        if (select == 1) {
            bookList.sort(new AscCategory());
        } else if (select == 2) {
            bookList.sort(new DescCategory());
        }

        // for문을 이용하여 ArrayList<BookDTO> 에 추가
        ArrayList<BookDTO> sortedBookList = new ArrayList<>();
        for(BookDTO book : bookList){
            sortedBookList.add(book);
        }

        // 해당 배열 주소 값 리턴
        return sortedBookList;
    }
    public void printBookList(ArrayList<BookDTO> br) {
        // 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
        for (BookDTO book : br) {
            System.out.println(book);
        }
    }
}