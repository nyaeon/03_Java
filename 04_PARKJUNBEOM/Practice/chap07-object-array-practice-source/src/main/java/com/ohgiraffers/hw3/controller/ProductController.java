package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw2.model.dto.StudentDTO;
import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);
    ProductDTO[] products = new ProductDTO[10];
    public void mainMenu() {
        int choice;
        do {
            String menu = """
                    ============= 회원 관리 프로그램 =============
                    1. 회원 등록
                    2. 회원 전체 조회
                    9. 프로그램 종료
                    ===========================================
                    메뉴 선택 : """;
            System.out.println(menu);
            choice = sc.nextInt();
            switch (menu) {
                case "1":
                    productInput();
                    break;
                case "2":
                    productPrint();
                    break;
                case "9":
                    return;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
        while (choice != 9);
        {
            sc.close();
        }
    }

    public void productInput() {
        System.out.print("제품 번호 : ");
        int pld = sc.nextInt();
        System.out.print("제품 이름 : ");
        String pName = sc.next();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        for (int count = 0; count < products.length; count++) {
            products[count] = new ProductDTO();
        }
    }

    public void productPrint() {
        int count;
        for (count = 0; count < products.length; count++) {
            products[count] = new ProductDTO();
        }
        System.out.println(products[count].information());
    }

}


