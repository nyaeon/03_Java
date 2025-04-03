package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    Scanner sc = new Scanner(System.in);
    public static int count = 0;
    private ProductDTO[] prodarray = new ProductDTO[10];

    public void mainMenu() {
        String productMenu = """
                ===== 제품 관리 메뉴 =====
                1. 제품 정보 추가
                2. 제품 전체 조회
                9. 프로그램 종료      """;
        int menuChoice;

        do {
            System.out.println(productMenu);
            System.out.print("메뉴 선택 : ");
            menuChoice = sc.nextInt();
            switch (menuChoice) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    break;
            }
        } while (menuChoice == 1 || menuChoice == 2);

    }

    public void productInput() {
        ProductDTO pro = new ProductDTO();
        System.out.print("제품 번호 : ");
        pro.setpId(sc.nextInt());
        System.out.print("제품 이름 : ");
        pro.setpName(sc.next());
        System.out.print("제품 가격 : ");
        pro .setPrice(sc.nextInt());
        System.out.print("제품 세금 : ");
        pro.setTax(sc.nextDouble());
        prodarray[count] = pro;
        count += 1;
    }

    public void productPrint() {
        for (int i = 0; i < count; i++) {
            System.out.println(
                              "제품 번호 : " + prodarray[i].getpId() +
                            ", 제품 이름 : " + prodarray[i].getpName() +
                            ", 제품 가격 : " + prodarray[i].getPrice() +
                            ", 제품 세금 : " + prodarray[i].getTax());
        }
    }

    }




