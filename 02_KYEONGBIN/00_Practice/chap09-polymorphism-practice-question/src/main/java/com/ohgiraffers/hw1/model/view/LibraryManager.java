package com.ohgiraffers.hw1.model.view;

import com.ohgiraffers.hw1.model.dto.*;
import java.util.ArrayList;

public class LibraryManager {
    private Member mem = null;
    private final Book[] bList = new Book[5];

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
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : bList) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result.toArray(new Book[0]);
    }

    public int rentBook(int index) {
        Book book = bList[index];
        if (book instanceof AniBook ani && mem.getAge() < ani.getAccessAge()) {
            return 1;
        }
        if (book instanceof CookBook cook && cook.isCoupon()) {
            mem.setCouponCount(mem.getCouponCount() + 1);
            return 2;
        }
        return 0;
    }
}
