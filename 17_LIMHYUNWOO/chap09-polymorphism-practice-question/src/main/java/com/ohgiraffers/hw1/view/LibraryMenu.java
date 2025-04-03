package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.*;

import java.util.Scanner;

public class LibraryMenu {
    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        char gender = sc.next().charAt(0);
       lm.insertMember(new Member(name, age, gender));
       do{
           System.out.print("""
                   ==== 메뉴 ====
                   1. 마이페이지
                   2. 도서 전체 조회
                   3. 도서 검색
                   4. 도서 대여하기
                   0. 프로그램 종료하기
                   """); int choice = sc.nextInt();
                   sc.nextLine();
                   switch (choice) {
                       case 1:{
                           Member output =lm.myInfo();
                           System.out.println(output);
                           break;}
                       case 2: selectAll();break;
                       case 3: searchBook();break;
                       case 4: rentBook();break;
                       case 0:
                           System.out.println("프로그램을 종료합니다.");
                           break;
                       default:
                           System.out.println("번호를 잘못 입력하셨습니다 번호를 다시 입력해주세요.");
                   }

       } while(true);
    }

    public void selectAll(){
        Book[] blist =lm.selectAll();
        for(int i =0 ; i<blist.length; i++){
            System.out.println(i+"번도서:" +blist[i].toString());
        }
    }

    public void searchBook(){
        String search = sc.nextLine();
        Book[] searchList=lm.searchBook(search);
        for(Book book: searchList){
            if(book==null) {
                break;
            }
            System.out.println(book.toString());
        }
    }

    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        int result=lm.rentBook(index);
        switch(result){
            case 0:  System.out.println("성공적으로 대여되었습니다."); break;
            case 1:  System.out.println("나이 제한으로 대여 불가능입니다."); break;
            case 2:  System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요 ");break;
            default:
                break;
        }
    }

}
