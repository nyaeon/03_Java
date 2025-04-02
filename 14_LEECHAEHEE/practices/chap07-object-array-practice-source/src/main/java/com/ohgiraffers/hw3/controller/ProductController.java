package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
 ProductDTO[] pro = new ProductDTO[10];
 int num;
 public static int count = 0;
 Scanner sc = new Scanner(System.in);

 public void mainMenu() {
     do {
         String menu = """
                 =====================
                 제품 관리 메뉴
                 1. 제품 정보 추가
                 2. 제품 전체 조회
                 9. 프로그램 종료  
                 메뉴 선택 :  """;
         System.out.println(menu);
         int choice = sc.nextInt();
         switch (choice) {
             case 1:
                 productInput();
                 break;
             case 2:
                 productPrint();
                 break;
             case 9:
                 System.out.println("프로그램을 종료합니다.");
                 break;
             default:
                 System.out.println("잘못된 번호를 입력하셨습니다.");
                 break;
         }
     }
     while (count < 10);
 }

 public void productInput() {
     System.out.print("제품 번호: ");
     pro[count].setpId(sc.nextInt());
     System.out.print("제품명을 입력하세요 : ");
         pro[count].setpName(sc.next());
     System.out.print("제품 가격을 입력하세요 : ");
         pro[count].setPrice(sc.nextInt());
     System.out.print("제품 세금을 입력하세요 : ");
         pro[count].setTax(sc.nextDouble());
         count++;
 }

 public void productPrint() {
     System.out.println("제품번호= " + pro[count].getpName()
             + ", 제품명= " + pro[count].getpId()
     + ", 제품가격= " + pro[count].getpName()
     + ", 제품 세금=  " + pro[count].getPrice());
 }
}
