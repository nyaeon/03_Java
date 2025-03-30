package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요(-포함):");
        String id = sc.nextLine();
        char num = id.charAt(7);
        if(num == '1' || num == '3'){
            System.out.println("남성");
        } else if (num == '2' || num == '4') {
            System.out.println("여성");
        }else{
            System.out.println("다시 입력");
        }
    }
}
