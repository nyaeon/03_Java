package com.ohgiraffers.hw1.model.view;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {

    public Member getMem() {return mem;}
    public void setMem(Member mem) {this.mem = mem;}


    public Book[] getbList() {
        return bList;}


    public void setbList(Book[] bList) {
        this.bList = bList;
    }

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

    public Book[] searchBook(String title) {
        for (Book book : bList) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                return new Book[]{book};
            }
        }
        return null;
        }
    }


