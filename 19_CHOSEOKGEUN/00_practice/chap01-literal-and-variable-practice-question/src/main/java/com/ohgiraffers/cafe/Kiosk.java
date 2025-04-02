package com.ohgiraffers.cafe;
import java.util.Scanner;
public class Kiosk {
    private Menu menu = new Menu();
    private Order order = new Order();
    private Scanner scanner = new Scanner(System.in);

    public void takeOrder() {
        while (true) {
            menu.showMenu();
            System.out.print("주문할 메뉴 번호를 선택하세요 (0: 주문 완료): ");
            int choice = scanner.nextInt();

            if (choice == 0) break;
            if (choice > 0 && choice <= menu.size()) {
                order.addItem(menu.getItem(choice - 1));
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
        order.printReceipt();
    }
}
