package HOMEWORK2_week.chep05.array.section01;

import java.util.Scanner;

public class Application2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"불닭", "와사비", "민초", "취두부", "마라탕"};
        System.out.print("치킨 이름을 입력하셔유 :");
        String chicken = sc.nextLine();
        boolean choice = false;
        for (String item : menu) {
            if (item.equals(chicken)) {
                choice = true;
                break;
            }
        }
        if (choice) {
            System.out.println(chicken + " 배달 가능");
        }else {
            System.out.println(chicken + " 그런건 없음");
        }
    }
}
   //    switch (chicken) {
   //        case (menu[0].equals(chicken.length()))
   //    }
