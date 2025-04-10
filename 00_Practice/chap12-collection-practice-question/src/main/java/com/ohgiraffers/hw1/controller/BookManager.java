package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();

    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {

        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getbNo() == index){
                bookList.remove(i);
                System.out.println("해당 도서가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 도서번호는 없습니다.");
    }

    public int searchBook(String Title) {

        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(Title)){
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index){
        if(index == -1){
            System.out.println("조회한 도서가 존재하지 않음.");
        } else {
            System.out.println(bookList.get(index));
        }
    }

    public void displayAll(){
        for(BookDTO book : bookList){
            System.out.println(book);
        }
    }

    public ArrayList<BookDTO> sortBookList(int select){

        if(select==1) {
            bookList.sort(new AscCategory());
        } else if (select==2) {
            bookList.sort(new DescCategory());
        }

        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){
        for (BookDTO b : br) {
            System.out.println(b);
        }
    }

}
