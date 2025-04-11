package com.ohgiraffers.hw1.view;

import java.util.Scanner;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {}
	
	public void menu(){
		
		do {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("메뉴 선택 : ");
			
			int menu = sc.nextInt();
		
			switch(menu) {
			case 1:	bm.addBook(inputBook());
				break;
			case 2:	
				System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순): ");
				int select = sc.nextInt();
				if(select == 1 || select == 2) {
					bm.printBookList(bm.sortedBookList(select));
				}else {
					System.out.println("번호를 잘못입력하셨습니다.");
				}
				break;
			case 3: System.out.println("삭제할 도서의 인덱스를 입력해 주세요");
					int index = sc.nextInt();
					bm.deleteBook(index);
				break;
			case 4:	bm.printBook(bm.searchBook(inputBookTitle()));
				break;
			case 5: bm.displayAll();
				break;
			case 6:
				System.out.print("정말 끝내시겠습니까? (y/n) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					System.out.println("프로그램을 종료합니다.");
					return;
				} else System.out.println("메뉴를 다시 불러옵니다.");
				
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(true);
	}
	
	public BookDTO inputBook() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("내용을 입력하세요.");
		System.out.print("도서번호(ISBN) : ");
		String bNo = sc.next();
		System.out.print("카테고리 (1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("책제목 : ");
		String bTitle = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		return new BookDTO(bNo, category, bTitle, author);
	}
	
	public String inputBookTitle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("확인할 도서명을 입력해주세요.");
		System.out.print("책제목 : ");
		return sc.nextLine();
	}
}
