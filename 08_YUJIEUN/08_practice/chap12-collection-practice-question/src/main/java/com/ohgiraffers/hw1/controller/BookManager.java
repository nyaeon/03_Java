package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        // bookList 인스턴스 생성
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book){
        //bookList에 도서 추가
        bookList.add(book);
    }

    public int deleteBook(int index){
        //전달받은 index로 삭제
        bookList.remove(index);
        return index;
    }

    public int searchBook(String bTitle){

        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getTitle().equalsIgnoreCase(bTitle)){
                return i;
            }
        }
        return -1;
        //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
    }

    public  void printBook(int index){
        // index에 해당하는 객체 출력
        System.out.println(bookList.get(index));

    }

    public  void displayAll(){

        if(bookList.isEmpty()){
            System.out.println("출력할 도서가 없습니다.");
        }else{
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }

        // 도서 전체 리스트를 출력
    }

    public ArrayList<BookDTO> sortedBookList(int select){

        ArrayList<BookDTO> sortedList = new ArrayList<>(bookList);

        if(select == 1){
//            sortedList.sort(Comparator.comparing(BookDTO::getCategory));
              sortedList.sort(new AscCategory());
        }else if(select == 2){
//            sortedList.sort(Comparator.comparing(BookDTO::getCategory).reversed());
              sortedList.sort(new DescCategory());
        }else {
            System.out.println();
            return null;

        }

        // 전달받은 매개변수의 값에 따라 정렬(1. 오름차순,2. 내림차순)
        // for문을 이용하여 ArrayList<BookDTO> 에 추가
        // 해당 배열 주소 값 리턴
        return sortedList;
    }

    public  void printBookList(ArrayList<BookDTO> br){

        for(BookDTO book : br){
            System.out.println(book);
        }
        // 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
    }

}
