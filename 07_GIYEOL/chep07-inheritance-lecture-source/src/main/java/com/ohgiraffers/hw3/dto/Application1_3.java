package com.ohgiraffers.hw3.dto;

import java.util.Scanner;

public class Application1_3 {
    public void mainManu(String[] args) {
        int count = 0;
         Scanner sc = new Scanner(System.in);
         ProductDTO[] dto = new ProductDTO[10];

            while (true) {
                System.out.println("""
                        =====제품 관리 메뉴 =====
                        1.제품 정보 추가
                        2.제품 전체 조회
                        9.프로그램 종료
                        """);

        int choice = sc.nextInt();
                dto[count] = new ProductDTO();
            switch (choice) {
                case (choice ==1) :
                    productInput(dto[count], sc, count);
                    count++;
                    break;
                case (choice==2):
                    productprint(dto[count]);
                case (choice==9):
                    System.out.println("프로그램 종료");
                    return;
                    break;
                default:
                    System.out.println("잘못된 선택");
                    break;
                }

            }
//              public void productInput(dto, sc, count){
//                if(count<dto.length) {
//                  dto[count] = new ProductDTO();
//                  System.out.println("제품 번호 :");
//                  dto[count].setPid(sc.nextInt());
//                  System.out.println("제품명 :");
//                  dto[count].setPname(sc.next());
//                  System.out.println("제품 가격 :");
//                  dto[count].setPrice(sc.nextInt());
//                  System.out.println("제품 세금 :");
//                  dto[count].setTax(sc.nextDouble());
//                  }
//              }else{
//              System.out.println("끝");
//      }
                public void productprint(dto, count){
                if(count == 0){
                System.out.println(dto[count].toString());
        }
                else{
                    for(int i=0;i<count;i++){
                        System.out.println(dto[i].toString());
                    }
                }
            }

    }

    private void productInput(ProductDTO productDTO, Scanner sc, int count) {

    }
}
