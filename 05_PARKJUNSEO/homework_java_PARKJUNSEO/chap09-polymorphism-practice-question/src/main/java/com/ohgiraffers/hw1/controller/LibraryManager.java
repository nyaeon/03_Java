package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;
import com.ohgiraffers.hw1.model.dto.AniBook;

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


    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myinfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }

    int[] nums = {0, 1, 2, 3, 4};
    public Book[] searchBook(String keyword) {
        Book[] blistKey = new Book[5];
        for(int num : nums) {
            if (bList[num].getTitle().contains(keyword)) {
                blistKey[num] = bList[num];
            };
        }
        return blistKey;
    }

    public int rentBook(int index) {
        index = 0;
        if (bList[index].) {
            System.out.print("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        } else if (index == 1) {
            System.out.print("나이 제한으로 대여 불가능입니다.");
            index = 1;
        } else {
            System.out.print("성공적으로 대여되었습니다.");
            coupon += 1;
        }
        return 0;
    }


    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getBList() {
        return bList;
    }

    public void setBList(Book[] blist) {
        this.bList = blist;
    }


}
