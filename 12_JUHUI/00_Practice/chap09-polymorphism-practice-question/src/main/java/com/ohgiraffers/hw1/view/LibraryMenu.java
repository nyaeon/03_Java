package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Member;
import com.ohgiraffers.hw1.model.dto.Book;

import java.util.Scanner;

public class LibraryMenu {

    // 기능을 동작하는 manager의 메서드를 사용하기 위해서 객체를 생성한거고
    private LibraryManager lm = new LibraryManager();// 객체를 생성해야 사용 가능
    Scanner sc = new Scanner(System.in);
    int num = 0;

    public void mainMenu(){

        System.out.println("=== 회원 정보 입력 ===");
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        System.out.print("성별을 입력하세요(M/F): ");
        char gender = sc.nextLine().charAt(0);

        // Member 객체 생성 및 LibraryManager에 전달
        Member mem = new Member(name, age, gender);
        lm.insertMember(mem);

        String menu = """
                ==== 메뉴 ====
                1.마이페이지
                2.도서 전체 조회
                3.도서 검색
                4.도서 대여하기
                0.프로그램 종료하기
                """;

        do {
            System.out.println(menu);
            num = sc.nextInt();

            switch (num) {
                case 1:
                    Member myInfo = lm.myInfo();
                    System.out.println(myInfo);
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
                    return;
            }
        } while (num != 0);
    }

    public void selectAll() {
        Book[] books = lm.selectAll(); //selectAll() 메소드를 호출해서 받은 값을 Book[]의 자료형으로 받아줌.

        System.out.println("==도서 전체 조회==");
        for(int i = 0; i < books.length; i++){
            if(books[i] != null){
                System.out.println(i + "번 도서: " + books[i].toString());
            }
        }


    }

    public void searchBook() {
        System.out.println("검색할 제목 키워드 : ");
        String keyword = sc.nextLine(); //입력받은걸 manager의 seachbook메소드로 전달하는데 반환값의 키워드로 넣어줌.

        Book[] searchResult = lm.searchBook(keyword);

        System.out.println("===검색 결과===");
        //향상된 for문 사용해 Book[] 자료형으로 받은걸 출력
        for(Book book : searchResult ){
            if(book != null){
                System.out.println(book);
            }
        }
    }

    public void rentBook() {
        // 도서 전체 조회로 도서 목록 확인
        selectAll();

        // 대여할 도서 번호 입력 받기
        System.out.println("대여할 도서 번호 선택 :" );
        int index = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // LibraryManager의 rentBook()에 인덱스를 전달하고 결과 받기
        int searchRearch = lm.rentBook(index);

        switch(searchRearch) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");
                break;
            default:
                System.out.println("대여 중 오류가 발생했습니다.");
                break;
        }
    }
}
