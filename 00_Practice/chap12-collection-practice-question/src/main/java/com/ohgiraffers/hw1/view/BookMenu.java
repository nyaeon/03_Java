package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm;

    public BookMenu() {
    }

    public void menu() {
        BookManager bm = new BookManager();
        System.out.println(BookManager );
    }

    public BookDTO inputBook() {
    }

    public String inputBookTitle() {
    }
}
