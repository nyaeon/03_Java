package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.view.BoardMenu;

public class Application {
    public static void main(String[] args) {
        // BoardMenu 클래스 객체 생성하고 mainMenu() 메소드 실행
        BoardMenu bm = new BoardMenu();
        bm.mainMenu();
    }
}