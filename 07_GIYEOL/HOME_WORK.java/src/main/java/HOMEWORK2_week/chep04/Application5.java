package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수:");
        int man = sc.nextInt();
        System.out.print("사탕 개수:");
        int candy = sc.nextInt();
        int sum,trash;
        sum = candy/man;
        trash = candy%man;
        System.out.println("1인당 사탕 개수는 "+sum+" 남은 사탕 수 "+trash);
    }
}
