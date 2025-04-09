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
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook (int index) {
        bookList.remove(index);
    }

    public int searchBook (String Title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(Title)) {
                return i;
            }
        } return -1;
    }

    public void printBook (int index) {
        BookManager bm = new BookManager();
        System.out.println(bookList.get(index).getTitle());
    }

    public void displayAll () {
        if (bookList != null) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).toString());
            }
        } else {
            System.out.println("출력할 도서가 없습니다.");
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
