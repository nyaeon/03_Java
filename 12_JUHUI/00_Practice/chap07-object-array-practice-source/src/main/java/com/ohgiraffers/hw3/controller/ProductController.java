package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro; // = null
    public static int count; // 현재 추가된 객체 수, 밑줄이 있으면 static임. 어디서든 공유 가능 계속 유지하고 있는 상태

    // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
    {
        pro = new ProductDTO[10];
    }

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        int no = 0;
        do {
            String menu = """ 
                ========== 제품 관리 메뉴========
                1. 제품 정보 추가
                2. 제품 전체 조회
                9. 프로그램 종료
                메뉴 선택 : """;
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
                    System.out.println("프로그램을 종료합니다."); break;
                    default:
                        System.out.println("잘못된 메뉴 번호입니다.");
            }
        } while (no != 9);

    }

    public void productInput() { // 제품 정보 추가
        // 키보드로 도서 정보를 입력 받아 객체 생성
        // -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
        // 현재 카운트 인덱스에 생성한 주소 저장
        if (count >= pro.length) {
            System.out.println("더 이상 제품을 추가할 수 없습니다.");
            return;
        }

//        System.out.print("제품 번호: ");
//        int pid = sc.nextInt();
//
//        sc.nextLine(); // 버퍼 비우기
//
//        System.out.print("제품 이름: ");
//        String pName = sc.nextLine();
//
//        System.out.print("제품 가격: ");
//        int price = sc.nextInt();
//        sc.nextLine(); // 버퍼 비우기
//
//        System.out.print("제품 세금: ");
//        int tax = sc.nextInt();
//        sc.nextLine(); // 버퍼 비우기

        while(count < pro.length) {
            pro[count] = new ProductDTO();
            System.out.println("제품 번호 : ");
            pro[count].setPid(sc.nextInt());
            System.out.println("제품 이름 : ");
            pro[count].setpName(sc.next());
            System.out.println("제품 가격 : ");
            pro[count].setPrice(sc.nextInt());
            System.out.println("제품 세금 : ");
            pro[count].setTax(sc.nextDouble());

            count++;
            break;
        }

        //pro[count] = new ProductDTO(pid, pName, price, tax); // ProductDTO 객체 생성 및 pro 배열에 저장
        //count++; // count 변수 1 증가
        //System.out.println("제품 정보가 추가되었습니다.");


    }

    public void productPrint() { // 제품 전체 조회
        // 현재까지 기록된 도서 정보 모두 출력
        System.out.println("========== 제품 전체 조회 ==========");
        if (count == 0) {
            System.out.println("등록된 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information()); // ProductDTO 클래스에 information() 메서드가 있다고 가정
        }

    }
    // 추가적으로 제품 삭제, 수정, 검색 등등의 메소드를 응용해서 추가해보세요~

}
