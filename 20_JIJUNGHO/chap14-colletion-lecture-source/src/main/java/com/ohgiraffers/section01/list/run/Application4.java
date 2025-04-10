package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {
        /*
        * Stack이란?
        * 후입선출(LIFO)의 자료구조로 push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리할 수 있다.
        * */

        Stack<Integer> stack = new Stack<>();

        // stack의 값 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        // stack의 최상위(top / 마지막) 조회 => 확인용
        System.out.println("peek() : " + stack.peek());
        System.out.println("stack = " + stack);

        // search(Object) : 입력한 값(Object)을 찾아 해당 위치(1부터 시작하는 위치)를 조회
        // 값이 없으면 -1 반환
        System.out.println("search() : " + stack.search(2));

        // pop() : 값 삭제, 삭제된 값을 출력함
        System.out.println("pop() : " + stack.pop()); // 5
        System.out.println("pop() : " + stack.pop()); // 4`
        System.out.println("pop() : " + stack.pop()); // 3
        System.out.println("pop() : " + stack.pop()); // 2
        System.out.println("pop() : " + stack.pop()); // 1
        // System.out.println(stack.pop()); // 더이상 값이 없을때 pop을 하면 EmptyStackException 발생

        System.out.println(stack);


    }

}
