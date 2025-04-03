package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro;
    public int count;
    Scanner sc;

    public ProductController() {
        pro = new ProductDTO[10];
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        boolean run = true;
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");

            var input = sc.nextInt();
            switch (input) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    run = false;
                    break;
            }
        } while (run);
    }

    public void productInput() {
        if (count >= pro.length) {
            System.out.println("가득 차서 더 추가할 수 없습니다.");
            return;
        }

        System.out.print("제품번호: ");
        int id = sc.nextInt();

        System.out.print("제품명: ");
        var name = sc.next();

        System.out.print("제품 가격: ");
        var price = sc.nextInt();

        System.out.print("제품 세금: ");
        var tax = sc.nextDouble();

        pro[count++] = new ProductDTO(id, name, price, tax);
    }

    public void productPrint() {
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
