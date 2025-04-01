package com.ohgiraffers.section03.subproject.coffee;

import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);
    private Barista barista = new Barista();

    public void menu() {

        String menu = """
                =================
                커피주문 프로그램
                =================
                1. 아메리카노
                2. 라떼
                0. 종료
                =================
                선택 : """;
        while (true) {
            System.out.println(menu);
            String choice = sc.nextLine();
            Order order = null;

            switch (choice) {
                case "1" :
                    break;
                case "2" :
                    break;
                case "0" :
                    return;
                default :
                    System.out.println("> 잘못 입력하셨습니다.");
            }
        }
    }
}
