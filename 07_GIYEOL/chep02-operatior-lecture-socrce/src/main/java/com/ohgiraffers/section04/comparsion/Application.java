package com.ohgiraffers.section04.comparsion;

public class Application {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 > num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 < num2);

        //문자값의 비교는 결국 숫자값 비교와 동일
        // 논리값 비교
        boolean isnum1 = true;
        boolean isnum2 = false;
        System.out.println(isnum1 == isnum2);
        System.out.println(isnum1 != isnum2);
     /*
        System.out.println(isnum1 > isnum2);
        System.out.println(isnum1 < isnum2);
        System.out.println(isnum1 <= isnum2);
        System.out.println(isnum1 >= isnum2);
      */

        //문자열값 비교
    String str3 = "java";
    String str4 = "java";

    System.out.println(str3 == str4);
    System.out.println(str3 != str4);



    }
}
