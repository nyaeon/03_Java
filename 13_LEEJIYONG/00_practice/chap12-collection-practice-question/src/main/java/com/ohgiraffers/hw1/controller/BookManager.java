package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        bookList.remove(index);
    }

    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        System.out.println(bookList.get(index));
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
            return;
        }

        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        if (select == 1) {
            bookList.sort(new AscCategory());
        } else {
            bookList.sort(new DescCategory());
        }

        return new ArrayList<>(bookList);
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }
}
