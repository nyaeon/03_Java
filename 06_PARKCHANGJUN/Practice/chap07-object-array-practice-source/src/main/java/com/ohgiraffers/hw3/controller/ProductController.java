package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    // 위의 클래스 다이어그램을 보고 필드 작성
    private ProductDTO[] pro = null;
    public static int count = 0;

    Scanner sc = new Scanner(System.in);

    // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
    {
        pro = new ProductDTO[10];
    }

    public void maniMenu() {
        int menu = 0;

        // 메뉴 출력 --> do~while 문으로 반복 실행 처리함
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");

            menu = sc.nextInt(); // 사용자로부터 입력을 받음

            switch (menu) {
                case 1: productInput();
                break;
                case 2: productPrint();
                break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                    default:
                        System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
                        break;
            }

        } while (menu != 9); // 9를 입력하면 종
    }

    public void productInput() {

        // 키보드로 도서 정보를 입력 받아 객체 생성
        System.out.println("제품 번호");
        int pId = sc.nextInt();

        System.out.println("제품명 : ");
        String pName = sc.next();

        System.out.println("제품 가격 : ");
        int price = sc.nextInt();

        System.out.println("제품 세금 : ");
        double tax = sc.nextInt();

        // 현재 카운트 인덱스에 생성한 주소 저장
        pro[count] = new ProductDTO(pId, pName, price, tax);
    }

    public void productPrint() {
        // 현재까지 기록된 도서 정보 모두 출력
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
