package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;
import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro = null;
    public static int count;
    private Scanner sc;

    public ProductController(int size, Scanner sc) {
        pro = new ProductDTO[size];
        this.sc = sc;
    }

    public void mainMenu() {
        String menu = """
            ===== 제품 관리 메뉴 =====
            1. 제품 정보 추가
            2. 제품 전체 조회 
            9. 프로그램 종료
            """;
        int num;
        do {
            System.out.println(menu);
            num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                productInput();
            } else if (num == 2) {
                productPrint();
            }

        } while (num != 9);
    }

    public void productInput() {
        System.out.print("제품 번호 : ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("제품명 : ");
        String pName = sc.nextLine();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();
        sc.nextLine();

        pro[count] = new ProductDTO(pId, pName, price, tax);
    }

    public void productPrint() {
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
