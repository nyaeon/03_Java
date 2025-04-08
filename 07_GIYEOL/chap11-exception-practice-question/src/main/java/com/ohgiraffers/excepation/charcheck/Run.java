package com.ohgiraffers.excepation.charcheck;

import java.util.Scanner;

public class Run {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = scanner.nextLine();
      try {
          CharcterProcess cp = new CharcterProcess();
          cp.countAlpha(s);
          System.out.println(cp.countAlpha(s));
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
  }
}
