package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.view.BookMenu;

import java.awt.print.Book;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        BookMenu bookMenu = new BookMenu();
        bookMenu.menu();
    }
}
