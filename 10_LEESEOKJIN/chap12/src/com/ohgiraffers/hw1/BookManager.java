package com.ohgiraffers.hw1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager {
    private final List<BookDTO> books = new ArrayList<>();

    public void addBook(BookDTO book) {
        books.add(book);
    }

    public void deleteBook(int index) throws IndexOutOfBoundsException {
        books.remove(index);
    }

    public int searchBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        System.out.println(books.get(index).toString());
    }

    public void displayAll() {
        printBookList(books);
    }

    public List<BookDTO> getSortedBookList(boolean descending) {
        var comparator = Comparator.comparingInt(BookDTO::getCategory);
        if (descending) {
            comparator = comparator.reversed();
        }

        var list = new ArrayList<>(books);
        list.sort(comparator);
        return list;
    }

    public static void printBookList(List<BookDTO> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
            return;
        }

        for (BookDTO book : bookList) {
            System.out.println(book.toString());
        }
    }
}
