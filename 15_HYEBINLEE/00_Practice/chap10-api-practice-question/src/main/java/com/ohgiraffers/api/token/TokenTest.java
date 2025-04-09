package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
  public static void main(String[] args) {
    String input = "J a v a P r o g r a m ";
    StringTokenizer st = new StringTokenizer(input, " ");
    char[] arr = new char[st.countTokens()];
    System.out.println("처리전 글자: "+input+"처리전 갯수: "+1);
    for(int i = 0; i < arr.length; i++){
      arr[i] = st.nextToken().charAt(0);
    }
    System.out.println("처리 후 갯수: "+arr.length);
    System.out.println(Arrays.toString(arr));
    StringBuilder sb = new StringBuilder("");
    for(char c : arr){
      System.out.print(c + ", ");
      sb.append(c);
    }
    System.out.println();
    System.out.println(sb);
  }
}
