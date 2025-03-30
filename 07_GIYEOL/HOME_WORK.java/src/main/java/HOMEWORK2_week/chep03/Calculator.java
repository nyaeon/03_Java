package HOMEWORK2_week.chep03;

import java.util.Scanner;

public class Calculator {
    public static void checkMethod() {
        // Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("x 메소드 호출 확인");
        return ;
        // char checkMethod= sc.nextLine().charAt(0);

        //   if(checkMethod == 'x') {
        //     System.out.println(checkMethod);}
    }

    public static void String() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하시오:");
        int a = sc.nextInt();
        System.out.print("첫번째 수를 입력하시오:");
        int b = sc.nextInt();
        int sum;
        sum = a + b;
        System.out.println(a + "와" + b + "의 합은 :" + sum + "입니다.");

    }

    public static void String2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하세요:");
        int x = sc.nextInt();
        System.out.print("두번째 수를 입력하세요:");
        int y = sc.nextInt();
        int sum;
        sum = x * y;
        System.out.println(x + "와" + y + " 곱은 :" + sum + "입니다.");
    }

    public static void multiTwoNumbers2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수를 입력:");
        int x = sc.nextInt();
        System.out.print("두번째 수를 입력:");
        int y = sc.nextInt();
        int result = x * y;
        System.out.println(x + "와" + y + " 곱은 " + result + "입니다.");
    }
    

    
    
}



