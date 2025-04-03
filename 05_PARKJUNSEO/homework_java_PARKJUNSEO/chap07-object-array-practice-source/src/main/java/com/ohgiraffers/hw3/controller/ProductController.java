package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    public void mainMenu() {
        String productMenu = """
                ===== 제품 관리 메뉴 =====
                1. 제품 정보 추가
                2. 제품 전체 조회
                9. 프로그램 종료
                """;
        System.out.println(productMenu);
        productInput();
    }

    public static int count;

    private ProductDTO[] pro  = new ProductDTO[]{};

    Scanner sc = new Scanner(System.in);

    public void productInput() {
        System.out.print("메뉴 선택 : ");
        int menuChoice = sc.nextInt();
        System.out.print("제품 번호 : ");
        int menuNum = 0;
        System.out.print("제품 이름 : ");
        String menuName = sc.next();
        System.out.print("제품 가격 : ");
        int menuPrice = sc.nextInt();
        System.out.print("제품 세금 : ");
        double pro.tax = sc.nextDouble();
        ProductController.count++;
    }

    public void productPrint() {
        System.out.println("제품번호 : " + menu);
    }

}
