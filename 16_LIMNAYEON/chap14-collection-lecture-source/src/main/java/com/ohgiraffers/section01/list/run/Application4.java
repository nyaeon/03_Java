package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {


    public static void main(String[] args) {
        /*
         * Stack이란?
         * 후입선출(LIFO)의 자료구조로 push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리할 수 있다.
         * */

        Stack<Integer> stack = new Stack<Integer>();

//        stack.add(1); // 벡터에서 요소 추가
        stack.push(1); // 스택에서 사용하는 메소드, 요소 추가
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("push 후 stack : " + stack);

        System.out.println(" 마지막에 있는 요소 peek() : " + stack.peek()); // peek() : 마지막에 있는 요소를 가리킴(표시)
        System.out.println(stack);

        System.out.println("index 위치 확인 search() : " + stack.search(2));  // (위 기준)값이 어디에 있는지 확인, 없으면 -1로 출력

        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
//        System.out.println("pop() : " + stack.pop()); // 더이상 없는 값일때 pop을 하면 EmptyStackException발생
        System.out.println("pop 후 stack : " + stack);
    }
}

