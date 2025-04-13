package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();
        // 리스트계열에 데이터를 추가 : add(), index 지정도 가능
        //            데이터를 조회 : get(index)
        //            데이터를 수정 : set(index, value)
        //            데이터를 삭제 : remove(index)
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 45000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        System.out.println("bookList = " + bookList);
        System.out.println("size = " + bookList.size());

        for (BookDTO book : bookList) {
            System.out.println(book);
        }
//        Collections.sort(bookList);
        bookList.sort(new AscendingPrice());
        System.out.println("가격 오름차순 정렬 ==========");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
        bookList.sort(new Comparator<BookDTO>() { // 익명클래스 정의
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() >= o2.getPrice() ? -1 : 1;
            }
        });
        System.out.println("가격 내림차순 정렬 ==========");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle()); // 문자열이므로 String클래스 compareTo() 메소드 사용 가능
            }                                                  // 내림차순은 반대로
        });
        System.out.println("책 제목 오름차순 정렬 ==========");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
        bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle())); //lambda 함수로도 사용 가능
        System.out.println("책 제목 내림차순 정렬 ==========");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }
}
