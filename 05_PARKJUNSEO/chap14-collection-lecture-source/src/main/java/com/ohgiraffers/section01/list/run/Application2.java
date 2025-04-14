package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.dto.BookDTO;
import com.ohgiraffers.section01.list.comparator.AscendingPrice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        
        List<BookDTO> bookList = new ArrayList<>();
        /*
        * 리스트 계열에 데이터를 추가 : add()
        * 리스트 계열에 데이터를 조회 : get(index)
        * 리스트 계열에 데이터를 수정 : set(index, value)
        * 리스트 계열에 데이터를 수정 : remove(index)
        * */

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 20000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 40000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 10000));
        
        System.out.println("bookList = " + bookList);
        System.out.println("bookList.size() = " + bookList.size());

        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        // Collections.sort(bookList);      // 정렬의 기준이 없음 (오류)   // 기본적으로 Integer나 String은 comparable이라서 비교가 가능함
        // 이런 경우 정렬하는 방법 (1. 클래스를 만들어 버리기. 2. 여기서만 쓰는 방법 만들기)

        bookList.sort(new AscendingPrice());  // sort는 comparator 계열의 클래스를 인자로 받는 듯. 그래서 그걸 상속받은 AscendingPrice를 받을 수 있는 것
        System.out.println("가격 오름차순 정렬 ===========================");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() {  // 익명 클래스
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() >= o2.getPrice() ? -1 : 1;
            }
        });

//        =============================================================

        System.out.println("가격 내림차순 정렬 ===========================");

        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("책 제목 오름차순 정렬 ===========================");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));

        System.out.println("책 제목 내림차순 정렬 ===========================");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }



    }
}
