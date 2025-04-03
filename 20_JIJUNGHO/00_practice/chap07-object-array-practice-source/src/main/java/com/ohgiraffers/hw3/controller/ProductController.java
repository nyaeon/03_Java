package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    ProductDTO[] pro = new ProductDTO[10];
    public static int count;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        int choice = 0;
        String mainMenu = """
                ===== 제품 관리 메뉴 =====
                1. 제품 정보 추가
                2. 제품 전체 조회
                9. 프로그램 종료
                메뉴 선택 : """;
        do {
            System.out.print(mainMenu );
            choice = sc.nextInt();

            switch (choice) {
                case 1: productInput();
                    break;
                case 2: productPrint();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        } while (choice != 9);
    }

    public void productInput() {
        Scanner sc = new Scanner(System.in);

        while (count < pro.length) {
            pro[count] = new ProductDTO();
            System.out.print("제품 번호 : ");
            pro[count].setpId(sc.nextInt());
            System.out.print("제품 이름 : ");
            pro[count].setpName(sc.next());
            System.out.print("제품 가격 : ");
            pro[count].setprice(sc.nextInt());
            System.out.print("제품 세금 : ");
            pro[count].setTax(sc.nextDouble());
            count++;
            break;
        }
    }

    public void productPrint() {
        for (ProductDTO product : pro) {
            if (product != null) {
                System.out.println(product.infomation());
            }
        }


    }

}
