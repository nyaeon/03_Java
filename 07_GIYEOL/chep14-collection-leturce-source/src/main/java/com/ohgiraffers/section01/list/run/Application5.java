package com.ohgiraffers.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        // Queue<String> queue = new Queue<>();
         Queue<String> queue = new LinkedList();
        //Linked<String> queue = new LinkedList<>(); //linkedlist는  queue 중에서도 deque에 해당되어                                       
        //offerFirst(), offerLAst() 같은 메소드도 제공됨
        //priorityQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다
        //priorityQueue<String> queue = new priorityQueue<>(); String의 기준대로 문자열 오름차순
        //priorityQueue<String> queue = new priorityQueue<>(Collections.reverseOrder()); //반대인 내림차순
        
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println(queue);

        /***
         * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소) 를 반환
         * poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소) 를 반환하고 제거
         *
         */
        System.out.println("peek()" + queue.peek());
        System.out.println(queue);
        System.out.println("poll()" + queue.poll());
        System.out.println(queue);
        
        
    }
}
