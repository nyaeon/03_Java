package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Run r = new Run();
        r.test();
    }

    public void test() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        NumberProcess np = new NumberProcess();

        try {
            boolean result = np.checkDouble(a, b);
            System.out.println(a + " is multiple of " + b);
        } catch (NumberRangeException e) {
            throw new RuntimeException(e);
        } finally {
            if (np != null) {
                try {
                    np.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        sc.close();
    }
}
