package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /*
        * Stack이란?
        * 후입선출(LIFO) 구조로 push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리할 수 있다.
        * */

        Stack<Integer> stack = new Stack<>();
        stack.push(1); //add()도 쓸 수 있지만 상위클래스 Vector가 보유한 add()를 사용하는 것이므로
                            // push()로 추가
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        System.out.println("peek() = " + stack.peek()); // 가장 상위, 즉 마지막의 요소를 확인
        System.out.println("stack = " + stack);

        System.out.println("search() = " + stack.search(5)); // 해당 값이 위에서 몇번째에 위치하는지 확인

        System.out.println("pop() = " + stack.pop()); // 가장 위에있는 값 삭제 및 보여줌 : 5
        System.out.println("pop() = " + stack.pop()); // 4
        // 만약 더이상 뺄 값이 없을때 pop을 하면 EmptyStackException 발생, 출력 시 빈 배열 출력


    }
}
