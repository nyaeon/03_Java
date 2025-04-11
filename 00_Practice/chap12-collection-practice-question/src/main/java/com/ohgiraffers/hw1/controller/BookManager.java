package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager implements Comparable<BookManager> {
    private ArrayList<BookDTO> bookList;

    public BookManager() {
    }

    ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();

    public void addBook (BookDTO book){
        bookList.add(book);
    }

    public void deleteBook(int index){
        bookList.remove(index);
    }

    public int searchBook(String bTitle) {

        // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        // 도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
    }

    public void printBook(int index){
        // index에 해당하는 객체 출력
    }

    public void displayAll(){
        // 도서 전체 리스트를 출력
    }

    public ArrayList<BookDTO> sortedBookList(int select){

        while(true) {
            System.out.println("""
                    정렬방식을 선택해주세요
                    1. 오름차순
                    2. 내림차순
                    0. 나가기
                    입력:""");

            switch(select){
                case 1:
                    Collections.sort(bookList);
                break;
                case 2:
                case 0:
                default:
                    break;
            }

            }

        }


    }

    public void publicBookList(ArrayList<BookDTO> br){
    }


}
