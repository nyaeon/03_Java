package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /***
         * stack
         * 후입선츨 (LIFO) 의 자료구조 push(),pop(),peek() 등의 메소드를 활용하여 자료를 처리할 수 있다
         *
         */
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        System.out.println("peek: " + stack.peek());
        System.out.println(stack);

        System.out.println("search(): " + stack.search(2)); //값이 어디 있는지 조회

        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
  //     System.out.println("pop(): " + stack.pop()); 더 이상 값이 존재하지 않으면 EmptyStackException 오류 발생
        System.out.println("stack : " + stack);

    }
}
