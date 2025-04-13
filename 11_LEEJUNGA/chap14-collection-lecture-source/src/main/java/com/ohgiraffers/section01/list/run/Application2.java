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
        // 리스트계열에 데이터를 추가 : add(), add(index, value)
        //            데이터를 조회 : get(index)
        //            데이터를 수정 : set(index, value)
        //            데이터를 삭제 : remove(index)

        bookList.add(new BookDTO(1, "홍길동전", "허균", 500000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 200000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 100000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 400000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 300000));

        System.out.println("bookList = " + bookList);
        System.out.println("bookList.size() = " + bookList.size());


//        Collections.sort(bookList); -> 정렬 기준이 없어 정렬하지 못함

        bookList.sort(new AscendingPrice());
        System.out.println("가격 오름차순 정렬 =============");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() { // 익명 클래스
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() >= o2.getPrice() ? -1 : 1;
            }
        });

        System.out.println("가격 내림차순 정렬 =============");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("책 제목 오름차순 정렬 ============");
        System.out.println("bookList = " + bookList);


        bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle())); // 람다
        System.out.println("책 제목 내림차순 정렬 ============");
        System.out.println("bookList = " + bookList);


    }
}
