package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> books;
    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        books.add(book);
    }

    public void deleteBook(int index) {
        books.remove(index);
    }

    public int searchBook(String title) {
        int index = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().contains(title)) {
                index = books.get(i).getbNo();
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public void printBook(int index) {
        if (index == -1) {
            System.out.println("조회한 도서가 존재하지 않음.");
        } else {
            System.out.println(books.get(index));
        }
    }

    public void displayAll() {
        System.out.println(books);
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        switch (select) {
            case 1:
                books.sort(new AscCategory());
                break;
            case 2:
                books.sort(new DescCategory());
                break;
            default:
                System.out.println("올바른 번호를 입력하세요.");
        }
        return books;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : br) {
            System.out.println(book);
        }
    }
}
