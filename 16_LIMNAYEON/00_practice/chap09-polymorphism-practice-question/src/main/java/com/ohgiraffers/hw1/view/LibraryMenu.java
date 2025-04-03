package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){


        System.out.print("회원 이름 입력: ");
        String name = sc.nextLine();

        System.out.print("회원 나이 입력: ");
        int age = sc.nextInt();

        System.out.print("회원 성별 입력: ");
        char gender = sc.next().charAt(0);

        lm.insertMember(new Member(name, age, gender));

        while(true){

            String menu = """
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    """;

            System.out.println(menu);
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    lm.myInfo();
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    searchBook();
                    break;
                case 0:
                    rentBook();
                    break;
                default:
                    System.out.println("제대로 입력하시지 않으셨습니다.");

            }


        }

    }


    public void selectAll(){
        Book[] bList = lm.selectAll();

        for(int i = 0; i < bList.length; i++){
            System.out.print( i + "번 도서 : " + bList[i].getTitle() + " / " + bList[i].getAuthor() + " / " + bList[i].getPublisher() + " / ");

            if (bList[i] instanceof AniBook){
                System.out.println(((AniBook) bList[i]).getAccessAge());
            } else {
                System.out.println(((CookBook) bList[i]).isCoupon());
            }

        }

    }

    public void searchBook(){

    }

    public void rentBook(){

    }
}
