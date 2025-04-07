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

	// 전달받은 내 신상 정보를 등록
	public void insertMember(Member mem) {
		this.mem = mem;
	}

	// 내 신상 정보 주소값 리턴
	public Member myInfo()	{
		return this.mem;
	}

	// 도서 목록 주소값 리턴
	public Book[] selectAll() {
		return this.bList;
	}

	// 도서검색 리스트 리턴
	public Book[] searchBook(String keyword) {

		// 우선 검색결과 도서목록이 최대 5개일 수 있으니 크기 5로 할당해놓기
		Book[] searchList = new Book[5];
		int count = 0;

		for(int i=0; i<bList.length; i++) {
			// equals()가 아닌 contains() 사용 --> 왜? 키워드이면 일치하는게 아니라 포함하는 결과를 찾아야 되기 때무니지!
			if(bList[i].getTitle().contains(keyword)) {
				searchList[count] = bList[i];
				count++;
			}
		}

		return searchList;
	}

	// 도서 대여하기
	public int rentBook(int index) {
		int result = 0;

		// 생각해봐야할 조건 2가지
		// 1. 대여할 도서가 만화책인 경우 나이제한에 걸리는 경우 --> result = 1
		// 2. 대여할 도서가 요리책인 경우 요리쿠폰이 있는 경우 --> result = 2, 내 쿠폰 갯수 1증가

		if(bList[index] instanceof AniBook) {
			if(((AniBook)bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		}else if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}

		return result;

	}








}
