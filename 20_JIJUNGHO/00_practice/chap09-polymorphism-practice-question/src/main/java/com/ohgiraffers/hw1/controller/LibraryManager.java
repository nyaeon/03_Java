package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.modal.dto.*;

public class LibraryManager {

    private Member mem = null;
    Book[] bList = new Book[5];

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

    public Member myInfo() {
        return this.mem;
    }

    public Book[] selectAll() {
        return this.bList;
    }

    public Book[] searchBook(String keyword) {
        Book[] books = new Book[5];

        for (int i = 0; i < bList.length; i++) {
            if (bList[i].getTitle().contains(keyword)) {
                books[i] = bList[i];
            }
        }
        return books;
    }

    public int rentBook(int index) {
        int result = 0;

        Book book = bList[index];

        if (book instanceof AniBook) {
            AniBook aniBook = (AniBook) book;
            if (aniBook.getAccessAge() > mem.getAge()) {
                result = 1;
            }
        } else if (book instanceof CookBook) {
            CookBook cookbook = (CookBook) book;
            if (cookbook.isCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        } else {
            result = 0;
        }
        return result;
    }

}
