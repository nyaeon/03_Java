package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    public int count = 0;
    private ProductDTO[] pro = new ProductDTO[10];
    Scanner sc = new Scanner(System.in);
    private boolean stop = false;

    public void mainMenu(){
        do {
            System.out.print("""
                    ==== 제품 관리 메뉴 ====
                    1.  제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    """); char ch = sc.next().charAt(0);
                    switch (ch) {
                        case '1': productInput();break;
                        case '2': productPrint();break;
                        case '9':
                            System.out.println("프로그램을 종료합니다.");
                            stop = true;
                            break;
                        default:
                            System.out.println("잘못된 번호를 입력하셨습니다 . 다시 입력해주세요. ");;

                    };
        } while(!stop);
    }

    public void productInput(){
        System.out.print("제품 번호를 입력해주세요 : ");
        int  pld = sc.nextInt();
        System.out.print("제품명을 입력해주세요 : ");
        String pName = sc.next();
        System.out.print("제품의 가격을 입려해주세요 : ");
        int price = sc.nextInt();
        System.out.print("제품의 세금을 입력해주세요 : ");
        double tax = sc.nextDouble();
        pro[count] = new ProductDTO(pld, pName, price, tax);
        count++;
    }

    public void productPrint(){
        for(int i = 0 ; i < count ; i++){
            System.out.println(pro[i].information());
        }
    }
}
