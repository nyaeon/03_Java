package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;
import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro;
    private int count;
    private Scanner sc;

    {
        pro = new ProductDTO[10];
        count = 0;
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("선택: ");
            choice = sc.nextInt();

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
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        } while (choice != 9);
    }

    public void productInput() {
        if (count >= pro.length) {
            System.out.println("더 이상 제품을 추가할 수 없습니다.");
            return;
        }

        System.out.print("제품 ID: ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("제품명: ");
        String pName = sc.nextLine();
        System.out.print("가격: ");
        int price = sc.nextInt();
        System.out.print("세금: ");
        double tax = sc.nextDouble();

        pro[count++] = new ProductDTO(pId, pName, price, tax);
        System.out.println("제품 정보가 추가되었습니다.");
    }

    public void productPrint() {
        if (count == 0) {
            System.out.println("등록된 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
