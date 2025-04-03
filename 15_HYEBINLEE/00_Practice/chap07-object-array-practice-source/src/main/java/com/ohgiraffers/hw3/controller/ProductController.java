package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;
import java.util.Scanner;
// 메뉴 출력 --> do~while 문으로 반복 실행 처리함
//===== 제품 관리 메뉴 =====
//    1. 제품 정보 추가 // productInput() 메소드 실행
//    2. 제품 전체 조회 // productPrint() 메소드 실행
//    9. 프로그램 종료

public class ProductController {

  Scanner sc = new Scanner(System.in);
  int count = 0;

  ProductDTO[] products = new ProductDTO[10];

  public void mainMenu() {
    do {
      System.out.println("===== 제품 관리 메뉴 =====");
      System.out.println("1. 제품 정보 추가");
      System.out.println("2. 제품 전체 조회");
      System.out.println("9. 프로그램 종료");
      System.out.print("메뉴 선택 : ");
      int cmd = sc.nextInt();
      if (cmd == 1) {
        productInput();
      } else if (cmd == 2) {
        productPrint();
      } else if (cmd == 9) {
        break;
      } else {
        System.out.println("잘못된 번호입니다. 다시 입력하세요.");
      }
    } while (true);

  }

  // 키보드로 도서 정보를 입력 받아 객체 생성
// -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
// 현재 카운트 인덱스에 생성한 주소 저장
  public void productInput() {
    System.out.print("제품 번호 : ");
    int pid = sc.nextInt();

    System.out.print("제품 이름 : ");
    String pName = sc.next();
    sc.nextLine();

    System.out.print("제품 가격 : ");
    int price = sc.nextInt();
    sc.nextLine();

    System.out.print("제품 세금 : ");
    double tax = sc.nextDouble();
    ProductDTO product = new ProductDTO(pid, pName, price, tax);
    products[count++] = product;
  }


// 현재까지 기록된 도서 정보 모두 출력
// 추가적으로 제품 삭제, 수정, 검색 등등의 메소드를 응용해서 추가해보세요~

  public void productPrint() {
    for(int i = 0; i < count; i++) {
      System.out.println(products[i].information());
    }
  }

}
