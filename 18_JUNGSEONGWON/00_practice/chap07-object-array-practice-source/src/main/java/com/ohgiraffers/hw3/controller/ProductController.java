package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in); // 입력 값 받게 Scanner 해주고
    int no;
    ProductDTO pd = new ProductDTO(); // 객체 설정
    ProductDTO[] pdArray = new ProductDTO[10]; //객체 배열 설정
    public static int count;
    public void mainMenu() {

        do {
            String menu = """
                    ========= 제품 관리 메뉴 ==========
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    메뉴 : """;
            System.out.println(menu);
            no = sc.nextInt();
            switch (no) {
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
                    System.out.println("다른 숫자를 입력해주세요");
            }
        } while(no != 9);
    }
    public void productInput(){
        while(count < pdArray.length) {
            pdArray[count] = new ProductDTO();
            System.out.print("제품 번호는? : ");
            pdArray[count].setPld(sc.nextInt());
            System.out.print("제품 이름은? : ");
            pdArray[count].setpName(sc.next());
            System.out.print("제품 가격은? : ");
            pdArray[count].setPrice(sc.nextInt());
            System.out.print("제품 세금은? : ");
            pdArray[count].setTax(sc.nextDouble());
            count++;
            break;
            }
        }
    public void productPrint(){
        for (ProductDTO p : pdArray) {
            if (p != null) {
                System.out.println(p.information());
            }
        }
    }
}



