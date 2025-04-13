package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    // 위의 클래스 다이어그램을 보고 필드 작성
    // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
    private ProductDTO[] pro = null;   // null
    {
        pro = new ProductDTO[10];
    }
    public static int count = 0;    // 현재 추가된 객체 수

    Scanner sc = new Scanner(System.in);

    // 메뉴 출력 --> do~while 문으로 반복 실행 처리함
    public void mainMenu() {

        String menu = """
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    3. 제품 정보 삭제
                    4. 제품 정보 수정
                    9. 프로그램 종료
                    ========================
                    선택 : """;

        do {
            System.out.print(menu);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 3:
                    productDelete();
                    break;
                case 4:
                    productUpdate();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        } while (true);
    }

    public void productInput() {
        // 키보드로 도서 정보를 입력 받아 객체 생성
        // -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
        // 현재 카운트 인덱스에 생성한 주소 저장

        System.out.print("제품번호 : ");
        int pId = sc.nextInt();
        System.out.print("제품명 : ");
        sc.nextLine();
        String pName = sc.nextLine();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(pId, pName, price, tax);
    }

    public void productPrint() {
        // 현재까지 기록된 도서 정보 모두 출력
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }

    // 추가적으로 제품 삭제, 수정, 검색 등등의 메소드를 응용해서 추가해보세요~
    // 제품 삭제
    public void productDelete() {

        System.out.print("삭제하고자 하는 제품 번호를 입력해주세요 : ");
        int pId = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (pro[i].getpId() == pId) {
                System.out.println(pro[i].information());
                System.out.print("삭제하고자 하는 제품의 정보가 맞습니까? (y/n): ");
                char choice = sc.next().charAt(0);
                if (choice == 'y' || choice == 'Y') {
                    for (int j = i; j < count; j++) {
                        pro[j] = pro[j + 1];
                    }
                    pro[count--] = null;
                    System.out.println("해당 제품이 삭제되었습니다.");
                } else {
                    System.out.println("제품 번호를 다시 확인해주세요.");
                    return;
                }
                return;
            } else {
                continue;
            }
        }
        System.out.println("해당되는 제품 번호가 존재하지 않습니다. 제품 번호를 다시 확인해주세요.");
    }

    // 제품 수정
    public void productUpdate() {

        String content = """
                ===== 수정 항목 메뉴 =====
                1. 제품 번호
                2. 제품명
                3. 제품 가격
                4. 제품 세금
                ========================
                수정하고자 하는 항목을 선택해주세요 :""";

        System.out.print("수정하고자 하는 제품 번호를 입력해주세요 : ");
        int pId = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (pro[i].getpId() == pId) {
                System.out.println(pro[i].information());
                System.out.print("수정하고자 하는 제품의 정보가 맞습니까? (y/n): ");
                char choice = sc.next().charAt(0);
                if (choice == 'y' || choice == 'Y') {
                    System.out.print(content);
                    int choice2 = sc.nextInt();
                    switch (choice2){
                        case 1:
                            System.out.print("제품 번호를 입력해주세요 : ");
                            pro[i].setpId(sc.nextInt());
                            break;
                        case 2:
                            System.out.print("제품명을 다시 입력해주세요 : ");
                            pro[i].setpName(sc.next());
                            break;
                        case 3:
                            System.out.print("제품 가격을 다시 입력해주세요 : ");
                            pro[i].setPrice(sc.nextInt());
                            break;
                        case 4:
                            System.out.print("제품 세금을 다시 입력해주세요 : ");
                            pro[i].setTax(sc.nextDouble());
                            break;
                        default:
                            System.out.println("잘못된 번호를 입력하셨습니다.");
                            break;
                    }
                } else {
                    System.out.println("제품 번호를 다시 확인해주세요.");
                    return;
                }
                return;
            } else {
                continue;
            }
        }
        System.out.println("해당되는 제품 번호가 존재하지 않습니다. 제품 번호를 다시 확인해주세요.");
    }
}
