package com.ohgiraffers.hw1.model.dto;

public class BookDTO {

	// Field
	private String bNo; // 도서번호
	private int category; // 도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
	private String title; // 책제목
	private String author; // 저자

	// 기본생성자, 매개변수 있는 생성자, getters and setters 작성함
	public BookDTO() {		
	}
	
	public BookDTO(String bNo, int category, String title, String author){
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	// Getter & Setter
	public void setBNo(String bNo){
		this.bNo = bNo;
	}
	
	public void setCategory(int category){
		this.category = category;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}

	public String getbNo() {
		return bNo;
	}

	public int getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	// toString() 오버라이딩함
	@Override
	public String toString(){
		return bNo +", "+category
				+", "+title +", "+author;
	}
}
