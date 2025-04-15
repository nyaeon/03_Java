package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    int a;
    ProductDTO[] pro = new ProductDTO[10];
    ProductDTO prod = new ProductDTO();
    public static int count;
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        String text;
        do{
            String menu = """
                    ==== 제품 관리 메뉴 ====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    입력 숫자 : """;
            System.out.print(menu);
            a = sc.nextInt();
            switch (a) {
                case 1: productInput();
                break;
                case 2: productPrint();
                break;
                case 9:
                    System.out.println("종료 됐습니다.");
                    break;
                default:
                    System.out.println("다른 숫자를 입력해주세요.");
            }
        } while (a != 9);
    }

    public void productInput() {
        while (count < pro.length) {
            pro[count] = new ProductDTO();
            System.out.print("제품 번호는? : ");
            pro[count].setPld(sc.nextInt());
            System.out.print("제품 이름은? : ");
            pro[count].setpName(sc.next());
            System.out.print("제품 가격은? : ");
            pro[count].setPrice(sc.nextInt());
            System.out.print("제품 세금은? : ");
            pro[count].setTax(sc.nextDouble());
            count++;
            break;
        }
    }

    public void productPrint() {
        for (ProductDTO product : pro) {
            if (product != null) {
                System.out.println(product.information());
            }
        }
    }





}
