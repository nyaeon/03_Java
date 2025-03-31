package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Level03_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int number = sc.nextInt();
        for(int i =1;i<=number;i++) {
            int result =0;

            switch (i) {
                case 1:
                    System.out.println("         1*8+"+i+"="+(result=1*8+i));
                    break;
                case 2:
                    System.out.println("        12*8+"+i+"="+(result=12*8+i));
                    break;
                case 3:
                    System.out.println("       123*8+"+i+"="+(result=123*8+i));
                    break;
                case 4:
                    System.out.println("      1234*8+"+i+"="+(result=1234*8+i));
                    break;
                case 5:
                    System.out.println("     12345*8"+i+"="+(result=12345*8+i));
                    break;
                case 6:
                    System.out.println("    123456*8+"+i+"="+(result=123456*8+i));
                    break;
                case 7:
                    System.out.println("   1234567*8+"+i+"="+(result=1234567*8+i));
                    break;
                case 8:
                    System.out.println("  12345678*8+"+i+"="+(result=12345678*8+i));
                    break;
                case 9:
                    System.out.println(" 123456789*8+"+i+"="+(result=123456789*8+i));
                    break;

            }
        }
        System.out.println();
        for(int i =1;i<=number*2;i++) {
        int result =0;

            switch (i) {
                case 1:
                    System.out.println("         1*8+"+i+"="+(result=1*8+i));
                    break;
                case 2:
                    System.out.println("        12*8+"+i+"="+(result=12*8+i));
                    break;
                case 3:
                    System.out.println("       123*8+"+i+"="+(result=123*8+i));
                    break;
                case 4:
                    System.out.println("      1234*8+"+i+"="+(result=1234*8+i));
                    break;
                case 5:
                    System.out.println("     12345*8"+i+"="+(result=12345*8+i));
                    break;
                case 6:
                    System.out.println("    123456*8+"+i+"="+(result=123456*8+i));
                    break;
                case 7:
                    System.out.println("   1234567*8+"+i+"="+(result=1234567*8+i));
                    break;
                case 8:
                    System.out.println("  12345678*8+"+i+"="+(result=12345678*8+i));
                    break;
                case 9:
                    System.out.println(" 123456789*8+"+i+"="+(result=123456789*8+i));
                    break;

            }
        }

    }
}
