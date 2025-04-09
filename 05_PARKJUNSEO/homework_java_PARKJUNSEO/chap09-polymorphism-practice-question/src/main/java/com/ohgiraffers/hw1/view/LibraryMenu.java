package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        Member mem = new Member();
        System.out.print("회원 이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("성별: ");
        char gender = sc.next().charAt(0);
        mem.setName(name);
        mem.setAge(age);
        mem.setGender(gender);
        lm.insertMember(mem);

        label :
        while (true) {
            System.out.println("""
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기""");
            int menuOption = sc.nextInt();
            switch (menuOption) {
                case 1:
                    System.out.println(lm.myinfo());
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
                    break label;
            }
        }
    }


    public void selectAll() {
        Book[] blist = lm.selectAll();
        for (int i = 0; i < blist.length; i++) {
            if (blist[i] instanceof CookBook == true) {
                System.out.println(i + "번 도서 : " + blist[i].getTitle() + ", "
                        + blist[i].getAuthor() + ", " + blist[i].getPublisher() + ", " + ((CookBook) blist[i]).isCoupon());
            } else {
                System.out.println(i + "번 도서 : " + blist[i].getTitle() + ", "
                        + blist[i].getAuthor() + ", " + blist[i].getPublisher() + ", " + ((AniBook) blist[i]).getAccessAge());
            }
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.next();
        Book[] searchList = lm.searchBook(keyword);
        int[] count = {0, 1, 2, 3, 4};
        for (int num : count) {
            if (searchList[num] != null) {
                System.out.println(searchList[num].getTitle());
            }

        }
    }

    public void rentBook() {
        selectAll();
        System.out.println("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);
        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.print("나이 제한으로 대여 불가능합니다.");
        } else {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }
    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }
}

