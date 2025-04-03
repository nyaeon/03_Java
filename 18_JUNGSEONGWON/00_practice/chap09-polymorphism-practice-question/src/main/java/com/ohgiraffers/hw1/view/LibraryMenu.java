package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu{
    private LibraryManager lm = new LibraryManager();
       public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        Member mem = new Member(name, age, gender);
        lm.insertMember(mem);

        while (true) {
            String menu = """
                    ======== 메뉴 ========
                    1.마이페이지
                    2.도서 전체 조회
                    3.도서 검색
                    4.도서 대여하기
                    0.프로그램 종료하기
                    메뉴 : """;
            System.out.println(menu);
            int no = sc.nextInt();
//            int sc = new Scanner(System.in).nextInt();

            switch (no) {
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2 :
                    selectAll();
                break;
                case 3 :
                     searchBook();
                break;
                case 4 :
                    rentBook();
                break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                default:
                    System.out.println("다른 숫자를 입력해주세요.");
                return;
            }
        }

    }
    public void selectAll() {
//        // LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
//        ➔ Book[] bList = lm.selectAll();
//        // for문 이용하여 bList의 모든 도서 목록 출력
//        // 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
//            ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
       Book[] bList = lm.selectAll();
       for (int i = 0; i < bList.length; i++) {
           System.out.println(i + "번의 도서 : " + bList[i]);
       }
    }
    public void searchBook() {
//    “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
//    LibraryManager의 searchBook() 에 전달
//    그 결과 값을 Book[] 자료형에 담기
//   ➔ Book[] searchList = lm.searchBook(keyword);
//   for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
//   NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
        Scanner sc = new Scanner(System.in);
        System.out.println("검색 할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] searchList = lm.searchBook(keyword);
        if (searchList[0] == null) {
        // 잘못된 값을 넣으면 searchList[0]이 생성이 안되서 null 값으로 들어가서 성립이 가능해 진다.
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (Book book : searchList) {
                if (book != null) {
                    System.out.println(book);
                }
            }
        }
    }
    public void rentBook() {
//        // 도서대여를 위해 도서번호를 알아야된다. → selectAll() 메소드 호출
//          “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
//          LibraryManager의 rentBook() 에 전달
//           그 결과 값을 result로 받고 그 result가
//          0일 경우 → “성공적으로 대여되었습니다.” 출력
//          1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
//          2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
//          마이페이지를 통해 확인하세요” 출력
        Scanner sc = new Scanner(System.in);
        selectAll();
        System.out.println("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();

        int result = lm.rentBook(index);

        switch (result){
            case 0 :
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1 :
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2 :
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰되었습니다. 마이 페이지를 통해 확인하세요.");
                break;
            default :
                System.out.println("잘못된 숫자를 입력하셨습니다.");
        }

    }

}



