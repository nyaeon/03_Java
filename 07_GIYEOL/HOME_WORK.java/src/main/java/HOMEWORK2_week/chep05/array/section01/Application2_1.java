package HOMEWORK2_week.chep05.array.section01;

import java.util.Scanner;

public class Application2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] ch = new String [10];
        System.out.print("문자열을 입력하세요:");
        String str = sc.nextLine();
        int[] arr = new int[str.length()];
        System.out.print("찾는 문자를 입력하세요 :");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str.charAt(i) == ch) {
                arr[count] =i;
                count++;

            }
        }
        System.out.println("찾으시는 문자는 " + count + " 개 입니다");

    }
}
