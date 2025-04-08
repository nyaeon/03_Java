package HOMEWORK2_week.chep05.array.section01;

import java.util.Scanner;

public class Application2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String[] ch = new String[10];
        System.out.println("문자열을 입력하세여 :");
        String ch = sc.nextLine();

        System.out.println("문자 입력하세요 :");
        char find = sc.next().charAt(0);

        int[] arr = new int[ch.length()];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ch.charAt(i) == find) {
                arr[count] =i;
                count++;

            }
        }
        System.out.print("문자열 : " + ch);
        System.out.println("문자 : " + find);
        System.out.print(arr[0] + " 에 " + find + "가 존재하는 인덱스 : " );
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println();
        System.out.println(find+ " 개수 : " + count);
    }

}
