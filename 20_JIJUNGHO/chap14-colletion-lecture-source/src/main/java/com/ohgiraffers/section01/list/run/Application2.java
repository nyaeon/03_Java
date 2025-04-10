package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<BookDTO>();
        /*
        * 리스트계열에 데이터를 추가 : add()
        *           데이터를 조회 : get(index)
        *           데이터를 수정 : set(index, value)
        *           데이터를 삭제 : remove(index)
        * */

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 40000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 30000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 20000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 10000));

        System.out.println("bookList = " + bookList);
        System.out.println("bookList.size() = " + bookList.size());

        for (BookDTO book : bookList) {
            System.out.println(book);
        }

//        Collections.sort(bookList);

        bookList.sort(new AscendingPrice());
        System.out.println("================= 가격 오름차순 정렬 =================");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
        // comparator 인터페이스가 구성되어있는
        bookList.sort(new Comparator<BookDTO>() {
            // 클래스 영역
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return 0;
            }
        });

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("책 제목 오름차순");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));

        System.out.println("책 제목 내림차순");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

    }
}
