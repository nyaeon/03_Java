package com.ohgiraffers.hw1.controller;

import java.util.ArrayList;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

public class BookManager {

    private ArrayList<BookDTO> bookList;
	
	public BookManager() {
		bookList = new ArrayList<BookDTO>();
	}
	
	public void addBook(BookDTO book) {	 //리스트에 객체 추가
		bookList.add(book);
	}
	
	public void deleteBook(int index) { //리스트에서 객체 제거
		bookList.remove(index);
	}
	
	public int searchBook(String bTitle) {
		//도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
		//도서명이 일치하는 객체가 리스트에 없으면, -1 리턴함
		int result = -1;
		
		for(int i = 0 ; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(bTitle)) {
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	public void printBook(int index) { //인덱스 위치의 객체의 정보를 출력함
		if(index == -1) {
			System.out.println("조회한 도서가 존재하지 않음");
		}else {
			System.out.println(bookList.get(index));
		}
		
	}
	
	public void displayAll() {		//목록정보 모두 출력
		
		if(bookList.isEmpty()) {
			
			System.out.println("출력할 도서가 없습니다.");
		} else {
			
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
	public ArrayList<BookDTO> sortedBookList(int select) {
		if(select == 1) {
			// 해당 카테고리순 오름차순정렬
			bookList.sort(new AscCategory());
		}else {
			bookList.sort(new DescCategory());
		}
		
		return bookList;
	}
	
	public void printBookList(ArrayList<BookDTO> br) {
		//for-each 문 사용
		for(BookDTO bk : br) {
			System.out.println(bk);
		}
	}
}
