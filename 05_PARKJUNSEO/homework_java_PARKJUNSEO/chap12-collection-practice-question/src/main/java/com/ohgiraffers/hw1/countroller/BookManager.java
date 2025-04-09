package com.ohgiraffers.hw1.countroller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.awt.print.Book;
import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager(){
        ArrayList<BookDTO> bList = new ArrayList<>();
        this.bookList = bList;
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook (int index) {
        bookList.remove(index);
    }

    public int searchBook (String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        } return -1;
    }

    public void printBook (int index) {
        System.out.println(bookList.get(index).toString());
    }

    public void displayAll () {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
            }
        else {for (int i = 0; i < bookList.size(); i++) {
        System.out.println(bookList.get(i).toString());
        }

        }

    }


    public ArrayList<BookDTO> sortedBookList(int select) {
        if (select == 1) {
            bookList.sort(new AscCategory());
        } else {
            bookList.sort(new DescCategory());
        }
        return bookList;
    }

    public void printBookList (ArrayList<BookDTO> br) {
        for (BookDTO b : br) {
            System.out.println(b.toString());
        }
    }

}
