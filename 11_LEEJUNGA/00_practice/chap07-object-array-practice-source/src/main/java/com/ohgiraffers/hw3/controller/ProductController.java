package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro;
    public static int count;
    Scanner sc;

    // 초기화 블록
    {
        pro = new ProductDTO[10];
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        do {
            String menuText = """
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    메뉴 선택 : """;

            System.out.println(menuText);
            int menu = sc.nextInt();

            switch (menu) {
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
                    System.out.println("없는 메뉴입니다.");
            }
        } while (true);
    }

    //새로운 제품 정보 기록을 위해 키보드로 정보들을 입력 받아 객체를 생성하고 현재 카운트 인덱스에 주소 저장
    public void productInput() {
        System.out.print("pId : ");
        int pId = sc.nextInt();
        System.out.print("pName : ");
        String pName = sc.next();
        System.out.print("price : ");
        int price = sc.nextInt();
        System.out.print("tax : ");
        double tax = sc.nextDouble();

        ProductDTO productDTO = new ProductDTO(pId, pName, price, tax);
        pro[count - 1] = productDTO;
    }

    // 현재까지 기록된 도서 정보 모두 출력
    public void productPrint() {
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
