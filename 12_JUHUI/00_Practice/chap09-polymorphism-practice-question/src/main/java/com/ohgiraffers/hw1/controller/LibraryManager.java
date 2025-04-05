package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.*;

import java.util.Scanner;

public class LibraryManager {

    private Member mem = null;

    private Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member member) {
        System.out.println("member =>>>>>>>>>>>>>>>> " + member);
        this.mem = member;
    }

    //메소드
    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {
        //전달받은 키워드가 포함된 도서가 여러 개가 존재할 수 있으니 검색된
        //도서를 담아줄 Book 객체 배열을 새로이 생성하고
        //for문을 통해 bList 안의 도서들과 전달받은 키워드를 비교하여 포함하고
        //있는 경우 새로운 배열에 차곡차곡 담기→ 그 배열 주소 값 리턴

        // 검색 결과를 담아줄 새로운 Book 객체 배열 생성
        // 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
        Book[] books = new Book[5];

        // for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
        // 전달받은 keyword를 포함하고 있으면 → HINT : String 클래스의 contains() 참고
        // 검색결과의 도서목록에 담기  → HINT : count 이용

        // 검색된 도서의 개수를 카운트할 변수
        int count = 0;

        // for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
        for (int i = 0; i < bList.length; i++) {
            // null이 아닌 경우에만 검사
            if (bList[i] != null) {
                // 전달받은 keyword를 포함하고 있으면 → String 클래스의 contains() 사용
                if (bList[i].getTitle().contains(keyword)) {
                    // 검색결과의 도서목록에 담기
                    books[count] = bList[i];
                    count++; // 검색 결과 카운트 증가

                    // 검색 결과 배열이 꽉 찼다면 더 이상 검색하지 않음
                    if (count == books.length) {
                        break;
                    }
                }
            }
        }

        // 검색 결과 배열 반환
        return books;
    }

    public int rentBook(int index) {
        //result를 0으로 초기화 한 후 전달받은 인덱스의 도서가 만화책인 경우
        //회원의 나이와 해당 만화책의 제한 나이를 비교하여 회원 나이가 더 적은 경우 result를 1로 초기화
        //아니면 전달받은 인덱스의 도서가 요리책인 경우 해당 요리책의 쿠폰 유무가 유일 경우
        // 회원의 couponCount를 1증가 시킨 후 result 2로 초기화 → result 리턴

        int result = 0;

        // 인덱스 범위 체크
        if (index < 0 || index >= bList.length || bList[index] == null) {
            return -1;  // 잘못된 인덱스나 존재하지 않는 도서
        }

        // 전달받은 인덱스의 도서가 만화책인 경우
        if (bList[index] instanceof AniBook) {
            AniBook ani = (AniBook) bList[index];
            // 회원의 나이와 해당 만화책의 제한 나이를 비교
            if (this.mem.getAge() < ani.getAccessAge()) {
                result = 1;  // 나이 제한으로 대여 불가
            }
        }
        // 전달받은 인덱스의 도서가 요리책인 경우
        else if (bList[index] instanceof CookBook) {
            CookBook cook = (CookBook) bList[index];
            // 요리책의 쿠폰 유무 확인
            if (cook.isCoupon()) {
                this.mem.setCouponCount(this.mem.getCouponCount() + 1);  // 쿠폰 카운트 증가
                result = 2;  // 쿠폰 발급됨
            }
        }

        return result;
    }
}
