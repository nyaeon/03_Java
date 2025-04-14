package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /**
         * Stack이란?
         * 후입선출(LIFO:Last In First Out)의 자료구조로 push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리할 수 있다.
         */

        Stack<Integer> stack = new Stack<Integer>();
//        stack.add(1);
        // push 대신 add로 해도 값은 같게 나온다.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        System.out.println("peek : " + stack.peek()); // 맨 마지막 들어간 요소. 확인용 -1
        System.out.println("stack = " + stack);

        System.out.println("search() : " + stack.search(2)); // 값이 어디에 있는지 확인. -2

        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
//        System.out.println("pop() : " + stack.pop()); // 더 이상 없는값일 때 pop을 하면 EmptyStackException 발생
        System.out.println("stack : " + stack);

    }
}
