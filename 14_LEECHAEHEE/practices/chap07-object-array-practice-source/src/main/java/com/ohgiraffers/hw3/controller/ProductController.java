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
                 return;
             default:
                 System.out.println("잘못된 번호를 입력하셨습니다.");
                 break;
         }
     }
     while (count < 10);
 }

 public void productInput() {
     System.out.print("제품 번호: ");
     int pNum = sc.nextInt();
     System.out.print("제품명을 입력하세요 : ");
     String pName = sc.next();
     System.out.print("제품 가격을 입력하세요 : ");
     int price = sc.nextInt();
     System.out.print("제품 세금을 입력하세요 : ");
     double tax = sc.nextDouble();
     pro[count] = new ProductDTO(pNum, pName, price, tax);
 }

 public void productPrint() {
     for (int i = 0; i < count; i++) {
         System.out.println("제품번호= " + pro[i].getpName()
                 + ", 제품명= " + pro[i].getpId()
                 + ", 제품가격= " + pro[i].getpName()
                 + ", 제품 세금=  " + pro[i].getPrice());
     }
 }
}
