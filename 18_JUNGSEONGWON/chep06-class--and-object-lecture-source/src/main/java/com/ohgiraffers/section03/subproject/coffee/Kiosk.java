package com.ohgiraffers.section03.subproject.coffee;

import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);
    private Barista barista = new Barista();

    public void menu(){

        String menu = """
                ================================
                커피주문 프로그램
                ================================
                1. 아메리카노
                2. 라떼
                0 종료
                ================================
                선택 : """;
        while (true){
            System.out.println(menu);
            String choice = sc.next();
            Order order = null;
            switch (choice) {
                case "1":
                    order = createOrder("아메리카노");
                    break;
                case "2":
                    createOrder("라떼");
                    break;
                case "0":
                    return; // 끝내겠다는 의미
                default:
                    System.out.println("잘못 입력하셨습니다.");
                }
                // 주문 요청 / 취소
                if(order != null){
                    sendCoffeeRequest(order);
                }else {
                    System.out.println("주문을 취소했습니다.");
                }
            }
        }

    private void sendCoffeeRequest(Order order) {
        Coffee[] coffees = barista.makeCoffee(order);
        System.out.println(">주문하신 " + Arrays.toString(coffees) + "가 나왔습니다.");
    }

    private Order createOrder(String menuName) {
        String option = inputOption();
        int count = inputCount();

        //주문 생성
          Order order = new Order(menuName , option, count);
       // 주문 확인
        boolean confirmed = confirmOrder(order);
        return confirmed ? order : null;
    } // 빨간 글씨에서 F2번을 누르면 빨간 줄로 넘어간다. 그러면 Alt + enter를 누르면 인텔리제이에서 수정사항을 추천 해준다.

    private boolean confirmOrder(Order order) {
        System.out.println("""
                > 주문 내역을 확인하세요. 
                =======================
                메뉴명 : %s 
                옵션 : %s
                수량 : %d 
                =======================
                > 주문 처리 1. 승인 2. 취소 
                 입력 : """.formatted(order.getName(), order.getOption(),order.getCount()));
        return sc.next().equals("1"); // 1이면 참이고 아니면 거짓이다.
    }

    private int inputCount() {
        System.out.println("> 수량을 입력하세요 : ");
        return sc.nextInt();
    }

    private String inputOption() {
        System.out.print("> 옵션을 선택하세요. 1. HOT , 2. ICE : ");

        return sc.next().equals("1") ? "HOT" : "ICE";
    }
}
