package HOMEWORK2_week.chep06.arrayhomework.hw3.dto;


import java.util.Scanner;

public class Application1_3 {
    private int count = 0;
    private Scanner sc = new Scanner(System.in);
    private ProductDTO[] dto = new ProductDTO[10];

    public void mainMenu() {
        while (true) {
            System.out.println("""
                    =====제품 관리 메뉴 =====
                    1.제품 정보 추가
                    2.제품 전체 조회
                    9.프로그램 종료
                    """);

            int choice = sc.nextInt();
            //    dto[count] = new ProductDTO[]; //()
            switch (choice) {
                case 1:
                    productInput(dto,sc);
                    //     productInput(dto[count], sc, count);
                    //      count++;
                    break;
                case 2:
                    productPrint(dto);
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 선택");
                    break;
            }
        }

    }

    private void productInput(ProductDTO[] dto, Scanner sc) {
        if (count >= dto.length) {
            System.out.println("더 이상 제품을 추가할 수 없습니다.");
            return;
        }

        dto[count] = new ProductDTO();
        System.out.println("제품 번호:");
        dto[count].setPid(sc.nextInt());
        System.out.println("제품명:");
        dto[count].setPname(sc.next());
        System.out.println("제품 가격:");
        dto[count].setPrice(sc.nextInt());
        System.out.println("제품 세금:");
        dto[count].setTax(sc.nextDouble());

        count++;
        System.out.println("제품이 추가되었습니다.");
    }

    private void productPrint(ProductDTO[] dto) {
        if (count == 0) {
            System.out.println("등록된 제품이 없습니다.");
            return;
        }

        System.out.println("===== 등록된 제품 =====");
        for (int i = 0; i < count; i++) {
            System.out.println(dto[i].toString());
        }
    }
}


//  private void productInput(ProductDTO productDTO, Scanner sc, int count) {
//      dto[count] = new ProductDTO();
//      System.out.println("제품 번호 :");
//      dto[count].setPid(sc.nextInt());
//      System.out.println("제품명 :");
//      dto[count].setPname(sc.next());
//      System.out.println("제품 가격 :");
//      dto[count].setPrice(sc.nextInt());
//      System.out.println("제품 세금 :");
//      dto[count].setTax(sc.nextDouble());
//  }

//  }



















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
