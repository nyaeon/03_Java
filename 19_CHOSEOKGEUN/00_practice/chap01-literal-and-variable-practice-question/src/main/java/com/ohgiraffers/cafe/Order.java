
package com.ohgiraffers.cafe;

import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> orderItems = new ArrayList<>();

    public void addItem(MenuItem item) {
        if (item != null) {
            orderItems.add(item);
            System.out.println(item.name + " 추가됨.");
        }
    }

    public void printReceipt() {
        System.out.println("\n--- 주문 내역 ---");
        int total = 0;
        for (MenuItem item : orderItems) {
            System.out.println(item.name + " - " + item.price + "원");
            total += item.price;
        }
        System.out.println("총 가격: " + total + "원");
        System.out.println("주문이 완료되었습니다. 감사합니다!");
    }
}

