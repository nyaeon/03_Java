package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro;
    public int count;
    protected Scanner sc;

    // 위의 클래스 다이어그램을 보고 필드 작성
    // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
    ProductDTO[] productDTOS = new ProductDTO[10];

    public ProductController() {
        sc = new Scanner(System.in);
    }

    public void mainMenu(){

        /*// 메뉴 출력 --> do~while 문으로 반복 실행 처리함
        ===== 제품 관리 메뉴 =====
        1. 제품 정보 추가 // productInput() 메소드 실행
        2. 제품 전체 조회 // productPrint() 메소드 실행
        9. 프로그램 종료
        * */
        boolean run = true;
        do{
            System.out.println("""
                     ===== 제품 관리 메뉴 =====
                            1. 제품 정보 추가 
                            2. 제품 전체 조회 
                            9. 프로그램 종료
                    """);
            switch(sc.nextInt()){
                case 1 :
                    productInput();
                    break;
                case 2 :
                    productPrint();
                    break;
                case 9 :
                    run = false;
                    break;
            }
        }while(run);
    }

    public void productInput(){
        // 키보드로 도서 정보를 입력 받아 객체 생성
        // -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
        // 현재 카운트 인덱스에 생성한 주소 저장
        System.out.println("제품 번호 : ");
        int pId = sc.nextInt();

        System.out.println("제품 이름 : ");
        String pName = sc.next();

        System.out.println("제품 가격 : ");
        int price = sc.nextInt();

        System.out.println("제품 세금 : ");
        double tax = sc.nextDouble();

        productDTOS[count] = new ProductDTO(tax,price,pName,pId);

        count++;

    }

    public void productPrint(){
        // 현재까지 기록된 도서 정보 모두 출력
        for(int i=0; i<count; i++) {
            System.out.println(productDTOS[i].Information());
        }
    }
    // 추가적으로 제품 삭제, 수정, 검색 등등의 메소드를 응용해서 추가해보세요~
}
