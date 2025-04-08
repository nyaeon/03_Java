package com.ohgiraffers.section04.test;

import java.util.Scanner;

public class Libararymenu {

    Scanner sc = new Scanner(System.in);
    private LibraryManager lm = new LibraryManager();
    public void mainMenu() {
        Libararymenu lib = new Libararymenu();
        Member Member = new Member();

//        int mem;
//        mem = sc.nextInt();
//        lm.insertMember(Member);
        System.out.println("""
                =======메뉴=====
                1.마이페이지
                2.도서 전체 조회
                3.도서 검색
                4.도서 대여하기
                0.종료
                """);
     while (true) {
         switch (sc.nextInt()) {
             case 1:
                 lm.myInfo();
                 System.out.println(lm.myInfo());
                 break;
             case 2:
                 lib.selectAll();
                 break;
             case 3:
                 lib.searchBook();
                 break;
             case 4:
                 lib.rentBook();
                 break;
             case 0:
                 System.out.println("종료");
                 break;
             }
         }
    }

    public void selectAll(){
        Book[] bList = lm.selectAll();
        for (Book book : bList) {
            System.out.println(book);
        };
    }
    public void searchBook() {
        String keyword;
        System.out.println("키워드를 입력:");
        keyword = sc.nextLine();
        Book[]searchList =lm.searchBook(keyword);
        for (Book book : searchList)  {
            System.out.println(book);
        }
    }
    public void rentBook() {
        System.out.println("대여할 도서번호 선택:");
        lm.selectAll();
        int result = sc.nextInt();
        result = lm.rentBook(result);
       if (result == 0) {
           System.out.println("성공적 대여");
           return;
       }else if (result == 1) {
           System.out.println("나이 제한 불가능");
           return;
       }else if (result == 2) {
           System.out.println("성공, 쿠폰 발급됨 ");
           return;
       }
    }
}
//switch (result) {
//       case 0: {
//       System.out.println("성공적 대여");
//               break;
//                       }
//                       case 1: {
//                       System.out.println("나이 제한 불가능");
//               break;
//                       }
//                       case 2: {
//                       System.out.println("성공, 쿠폰 발급됨 ");
//              break;
//                      }