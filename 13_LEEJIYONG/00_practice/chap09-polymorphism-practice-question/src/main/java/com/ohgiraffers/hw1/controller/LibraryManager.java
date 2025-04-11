package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;
import java.util.ArrayList;

public class LibraryManager {

    private Member mem;
    private Book[] bList;

    public LibraryManager() {
        this.mem = null;
        bList = new Book[5];
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member member) {
        this.mem = member;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {

        return bList;
    }

    public Book[] searchBook(String keyword) {
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : bList) {
            if (book.getTitle().contains(keyword)) {
                list.add(book);
            }
        }
        Book[] result = new Book[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int rentBook(int index) {
        int result = 0;

        if (index >= 0 && index < 5) {
            Book book = bList[index];

            if (book instanceof AniBook) {
                if (mem.getAge() < ((AniBook) book).getAccessAge()) {
                    result = 1;
                }
            } else if (book instanceof CookBook) {
                if (((CookBook) book).isCoupon()) {
                    mem.setCouponCount(mem.getCouponCount() + 1);
                    result = 2;
                }
            }
        } else {
            result = -1;
        }

        return result;
    }
}
