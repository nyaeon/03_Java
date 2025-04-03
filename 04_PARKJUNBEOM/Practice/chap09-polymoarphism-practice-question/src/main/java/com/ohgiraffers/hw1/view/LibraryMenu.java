package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        // LibraryManager의 insertMember() 메소드에 전달
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별(M/F) : ");
        char gender = sc.next().charAt(0);
        Member member = new Member(name, age, gender);
        lm.insertMember(member);

        while(true) {
            String menu = """
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    메뉴 선택 : """;
            System.out.print(menu);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(member);
                    break;
                case 2:
                    selectAll();
                    break;
                case 3: searchBook();
                    break;
                case 4: rentBook();
                    break;
                case 0: return;
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();

        for (int i =0; i < bList.length; i++) {
            System.out.println((i+1) + "번 도서 : " + bList[i] );
        }
        if (bList.length == 0) {
            System.out.println("검색하신 해당 도서가 현재 존재하지 않습니다.");
        }
    }

    public void searchBook() {
        sc.nextLine(); // 버퍼 비우기
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();

        Book[] searchList = lm.searchBook(keyword);

        for (Book b : searchList) {
            if (searchList.length > 0 && b != null) {
                System.out.println(b);  // Book의 toString() 자동 호출
            }
        }

    }



    public void rentBook() {
        Book[] bList = lm.selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index= sc.nextInt();
        int result = lm.rentBook(index);
        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        }else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        }else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다."+"\n"+
            "마이페이지를 통해 확인하세요");
        }
    }
}
