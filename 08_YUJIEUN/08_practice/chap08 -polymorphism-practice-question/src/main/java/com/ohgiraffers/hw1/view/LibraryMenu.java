package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    protected Scanner sc = new Scanner(System.in);


    public void mainMenu(){
        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        // LibraryManager의 insertMember() 메소드에 전달
        System.out.println("회원정보를 입력하세요.");
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("성별: ");
        char gender = sc.next().charAt(0);
        Member mem = new Member(gender,age,name);

        System.out.println("""
                ==== 메뉴 ====
                1.마이페이지
                2.도서 전체 조회
                3.도서 검색
                4.도서 대여하기
                0.프로그램 종료하기 
                """);

        lm.insertMember(mem);

        boolean ter = false;
        do{
            System.out.print("> ");
            int run = sc.nextInt();

            switch (run) {
                case 1:
                    lm.myInfo();
                    System.out.println(lm.myInfo());
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
                    ter = true;
                    break;
            }

        } while (ter == false); // ter가 false일 동안 반복
    }

    public void selectAll(){
        // LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
        Book[] bList = lm.selectAll();

        // for문 이용하여 bList의 모든 도서 목록 출력
        // 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
        for (int i=0;i< bList.length;i++){
            System.out.println(i+"번도서 :"+bList[i].toString());
        }

    }

    public void searchBook(){
        System.out.println("검색할 제목 키워드 : ");
        String keyword = sc.next();
        Book[] searchList = lm.searchBook(keyword);

        // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
        // NullPointerException 발생 시 오류 해결하시오

        for(Book book : searchList){
            if(book != null){
            System.out.println(book.toString());
            }
        }
    }

    public void rentBook(){

        int result = 0;
        lm.selectAll();
        int index = sc.nextInt();
        System.out.println("대여할 도서 번호 선택 :");

        result = lm.rentBook(index);

        switch (result){
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n" +
                        "마이페이지를 통해 확인하세요");
                break;
        }








    }
}


