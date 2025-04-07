package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro;
    public int count;
    Scanner sc = new Scanner(System.in);

    { pro = new ProductDTO[10]; }

    public void mainMenu(){

        int choice;
        do {
            String menu = """
                     ===== 제품 관리 메뉴 =====
                     1. 제품 정보 추가
                     2. 제품 전체 조회
                     9. 프로그램 종료
                     """;

            System.out.println(menu);
            System.out.print("메뉴 선택 : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } while (choice != 9);

    }

    public void productInput(){
        System.out.print("제품 번호: ");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.print("제품명: ");
        String pName= sc.nextLine();

        System.out.print("제품 가격: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("제품 세금: ");
        double brand = sc.nextDouble();

        ProductDTO product = new ProductDTO(pid, pName, price, brand);
        pro[count] = product;
        count++;

        System.out.println("제품이 성공적으로 추가되었습니다.");
    }

    public void productPrint(){

        if(count == 0) {
            System.out.println("등록된 상품은 없습니다.");
        } else {
            for(int i = 0; i < count; i++) {
                System.out.println(pro[i].information());
            }
        }
    }
}
