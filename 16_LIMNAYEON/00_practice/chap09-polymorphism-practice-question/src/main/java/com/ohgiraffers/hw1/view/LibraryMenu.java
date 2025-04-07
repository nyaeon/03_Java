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

            System.out.println(menu + "옵션을 선택해 주세요: ");

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
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
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
        sc.nextLine();
        System.out.print("검색할 키워드 : ");
        String keyword = sc.nextLine();

        Book[] searchList = lm.searchBook(keyword);

        boolean found = false;
        for (Book b : searchList) {
            if (b != null) {
                System.out.println(b.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }

    }

    public void rentBook(){
        selectAll();

        System.out.print("대여할 도서 번호 선택: ");
        int index = sc.nextInt();

        int result = lm.rentBook(index);

        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n마이페이지를 통해 확인하세요.");
                break;
            default:
                System.out.println("대여 처리 중 오류가 발생했습니다.");
        }
    }
}
