package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;
import com.ohgiraffers.hw1.model.dto.AniBook;

public class LibraryManager {

    private Member mem = null;
    private Book[] blist = new Book[5];
    Book[] bList;

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
        return blist;
    }

    public Book[] searchBook(String keyword) {
        Book[] blist1 = new Book[5];
        for()
        return null;
    }

    public int rentBook(int index) {
        return 0;
    }


    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getBlist() {
        return blist;
    }

    public void setBlist(Book[] blist) {
        this.blist = blist;
    }


}
