package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {
        /*
         * stack이란?
         * 후입선출(LIFO)의 자료로 push(),pop(),peak() 등의 메소드를 활용하여 자료를 처리할 수 있다.
         */

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        System.out.println("peak() : " + stack.peek()); // 마지막 요소 확인
        System.out.println(stack);

        // 값이 어디 위치에 있는지 확인, 스택은 후입선출임
        System.out.println("search() : " + stack.search(2));//값이 어디 위치에 있는지 조회해줌

        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        //System.out.println("pop() : " + stack.pop()); 한 번 더 하면 오류남. 왜냐? 더 없으니까
        // 더 없는 값일 때 pop을 하면 EmptyStackException 발생
        System.out.println(stack); // 빈 배열이 나옴


    }
}
