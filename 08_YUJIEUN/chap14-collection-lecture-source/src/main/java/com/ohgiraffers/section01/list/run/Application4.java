package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /*
         *stack이란?
         * 후입선출(LIFO)의 자료구조로 push(),pop(), peek() 등의  메소드를 활용하여 자료를 처리할 수 있더.
         */

        Stack<Integer> stack = new Stack<>();

        stack.push(1);

        System.out.println(stack);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println(stack);

        System.out.println("peek(): " + stack.peek());
        System.out.println(stack);

        System.out.println("search(): " + stack.search(2)); //순서상으로 2범째에 위치한 값이  뭔지 조회


        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        //System.out.println("pop(): " + stack.pop());  // 더 이상 없는 값 일때  pop을 하면 EmptyStackException이 일어난다.


    }
}
