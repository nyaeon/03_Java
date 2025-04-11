package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {

    public void test(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int second = sc.nextInt();
        NumberProcess process = new NumberProcess();


        try {
            process.checkDouble(first, second);
            if (process.checkDouble(first, second) == true) {
                System.out.print(first + "은(는) " + second + "의 배수입니다.");
            } else {System.out.print(first + "은(는) " + second + "의 배수가 아닙니다.");}
            } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
            } finally {
            sc.close();
            }

    }


    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }

}
