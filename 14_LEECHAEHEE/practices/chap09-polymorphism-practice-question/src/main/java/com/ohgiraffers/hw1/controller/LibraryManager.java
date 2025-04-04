package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

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

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {
    Book[] books = new Book[5];
    for (int i = 0; i < books.length; i++) {
        if (bList[i].getTitle().contains(keyword)) {
            books[i] = new Book(bList[i].getTitle(), bList[i].getAuthor(), bList[i].getPublisher());
        }
    }
    return books;
    }

public int rentBook(int index) {
    int result = 0;
    int count = 0;
    if (bList[index] instanceof AniBook) {
        AniBook book = (AniBook) bList[index];
        if (mem.getAge() < book.getAccessAge()) {
            result = 1;
        }
    } else if (bList[index] instanceof CookBook) {
        CookBook cbook = (CookBook) bList[index];
        if (cbook.isCoupon()) {
            count++;
            mem.setCouponCount(count);
            result = 2;
        }
    }
    return result;
}

}
