package HOMEWORK2_week.chep05;

import java.util.Arrays;
import java.util.Scanner;

public class Application2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록 번호 입력:");
        String ID = sc.nextLine();
        System.out.println(ID);
        //  System.out.println(Arrays.toString(ID.toCharArray()));
        for (char i = 8; i < ID.length()-1; i++) {
            cahange i = '*';
            System.out.print(ID.charAt(i));
        }
    }
}//4번 중복값 x