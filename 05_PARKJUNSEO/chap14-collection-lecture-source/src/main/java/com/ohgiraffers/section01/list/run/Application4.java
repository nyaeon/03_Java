package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /*
        * Stack이란?
        * 후입선출(LIFO)의 자료구조로 push(). pop(), pick() 등의 메소드를 활용하여 자료를 처리할 수 있다.
        * */

        Stack<Integer> stack = new Stack<Integer>();

//        stack.add(1);   // 리스트 계열의 메소드를 이용하는 것임. 이게 가능하긴한데, add()라는 거 자체가 stack을 쓰기 위한 용도는 아님
        stack.push(41);
        stack.push(47);
        stack.push(9);
        stack.push(33);
        stack.push(10);
        stack.push(51);

        System.out.println("stack = " + stack);

        System.out.println("peek() = " + stack.peek());     // 맨 마지막에 들어있는 것이 무엇인지 보는 메소드 (엿보다)
        System.out.println(stack);

        System.out.println("search() = " + stack.search(47)); // 위에서부터, 즉 늦게 쌓인 위치부터 어느 위치에 있는지 확인 (-1이 나오면 없다는 뜻)

        System.out.println("pop() : " + stack.pop());    // 맨 위에서부터 하나씩 빼옴  51
        System.out.println("pop() : " + stack.pop());    // 맨 위에서부터 하나씩 빼옴  10
        System.out.println("pop() : " + stack.pop());    // 맨 위에서부터 하나씩 빼옴  33
        System.out.println("pop() : " + stack.pop());    // 맨 위에서부터 하나씩 빼옴   9
        System.out.println("pop() : " + stack.pop());    // 맨 위에서부터 하나씩 빼옴  47
        System.out.println("pop() : " + stack.pop());    // 맨 위에서부터 하나씩 빼옴  41
        // System.out.println("pop() : " + stack.pop());    // 더 하면 오류남
        System.out.println("stack : " + stack);





    }
}
