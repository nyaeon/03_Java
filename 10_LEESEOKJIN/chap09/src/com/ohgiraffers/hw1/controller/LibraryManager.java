package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Arrays;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[] {
        new CookBook("백종원의 집밥", "백종원", "tvN", true),
        new AniBook("한번 더 해요", "미티", "원모어", 19),
        new AniBook("루피의 원피스", "루피", "japan", 12),
        new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false),
        new CookBook("최현석 날 따라해봐", "최현석", "소금책", true)
    };

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {
        return Arrays.stream(bList)
                .filter(b -> b.getTitle().contains(keyword))
                .toArray(Book[]::new);
    }

    public int rentBook(int index) {
        var book = bList[index];
        if (book instanceof AniBook aniBook) {
            if (mem.getAge() < aniBook.getAccessAge()) {
                return 1;
            }
        } else if (book instanceof CookBook cookBook) {
            if (cookBook.hasCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                return 2;
            }
        }
        return 0;
    }
}
