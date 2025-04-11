package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /*
        * Stack이란 ?
        * 후입선출(LIFO)의 자료구조로 push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리할 수 있다.
        * */

        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        System.out.println(stack);
        System.out.println("stack.peek() : " + stack.peek());

        System.out.println("stack.search() : " + stack.search(55)); // 값의 위치 검색(stack 위부터)
        System.out.println("stack.pop() : " + stack.pop());
        System.out.println("stack.pop() : " + stack.pop());
        System.out.println("stack.pop() : " + stack.pop());
        System.out.println("stack.pop() : " + stack.pop());
        System.out.println("stack.pop() : " + stack.pop());
//        System.out.println("stack.pop() : " + stack.pop());   // 더이상 값이 없을 때 pop을 하면 EmptyStackException 발생
        System.out.println(stack);
    }
}
