package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;
import java.util.Scanner;

public class LibraryMenu {
  LibraryManager lm = new LibraryManager();
  Scanner sc = new Scanner(System.in);

  public LibraryMenu() {}

  // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
  // LibraryManager의 insertMember() 메소드에 전달
  //==== 메뉴 ====
  //        1.
  //    2.
  //    3.
  //    4.
  //    0.
  //    마이페이지
  //    도서 전체 조회
  //    도서 검색
  //    도서 대여하기
  //    프로그램 종료하기
  // 무한 반복 실행
  // LibraryManager의 myInfo() 호출하여 출력
  // LibraryMenu의 selectAll() 호출
  // LibraryMenu의 searchBook() 호출
  // LibraryMenu의 rentBook() 호출
  public void mainMenu() {
    int cmd;
    String name;
    int age;
    char gender;
    System.out.print("이름: ");
    name = sc.nextLine();
    System.out.print("나이: ");
    age = sc.nextInt();
    System.out.print("성별: ");
    gender = sc.next().charAt(0);
    Member member = new Member(name, age, gender);
    lm.insertMember(member);
    while (true) {
      System.out.println("==== 메뉴 ====");
      System.out.println("1. 마이페이지");
      System.out.println("2. 도서 전체 조회");
      System.out.println("3. 도서 검색");
      System.out.println("4. 도서 대여하기");
      System.out.println("0. 프로그램 종료하기");

      cmd = sc.nextInt();
      if (cmd == 0) {
        break;
      }else if (cmd == 1) {
        Member myMember = lm.myInfo();
        System.out.println(myMember.toString());
      }else if (cmd == 2) {
        selectAll();
      }else if (cmd == 3) {
        searchBook();
      }else if (cmd == 4) {
        rentBook();
      }else if (cmd == 0) {
        break;
      }
    }
  }

  // LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
  // ➔ Book[] bList = lm.selectAll();
  // for문 이용하여 bList의 모든 도서 목록 출력
  // 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
  // ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
  public void selectAll() {
    Book[] bList = lm.selectAll();
    for(int i = 0; i < bList.length; i++) {
      System.out.println(i+"번도서 : "+bList[i].toString());
    }
  }


  // “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
  // LibraryManager의 searchBook() 에 전달
  // 그 결과 값을 Book[] 자료형에 담기
  // ➔ Book[] searchList = lm.searchBook(keyword);
  // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
  // NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
  public void searchBook() {
    System.out.print("검색할 제목 키워드 : ");
    String keyword = sc.next();
    Book[] searchList = lm.searchBook(keyword);
    for(Book book : searchList) {
      if(book==null) {
        return;
      }
      System.out.println(book.toString());
    }
  }


  // 도서대여를 위해 도서번호를 알아야된다. → selectAll() 메소드 호출
  // “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
  // LibraryManager의 rentBook() 에 전달
  // 그 결과 값을 result로 받고 그 result가
  // 0일 경우 → “성공적으로 대여되었습니다.” 출력
  // 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
  // 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
  // 마이페이지를 통해 확인하세요” 출력
  public void rentBook() {
    System.out.print("대여할 도서 번호 선택 : ");
    int index = sc.nextInt();
    int result = lm.rentBook(index);
    if(result==0) {
      System.out.println("성공적으로 대여되었습니다.");
    } else if(result == 1){
      System.out.println("나이 제한으로 대여 불가능입니다.");
    } else if(result == 2){
      System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
    }
  }

}
