package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application5 {

    public static void main(String[] args) {

//        Queue<String> queue = new Queue<>()
//        Queue<String> queue = new LinkedList<>();

//        LinkedList<String> queue = new LinkedList<>(); // LinkedList는 queue중에서도 deque에 해당되어
                               // offerFirst(), offerLast() 같은 메소드도 제공된다.

        // PriorityQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다.
//        PriorityQueue<String> queue = new PriorityQueue<>(); // String의 기준대로 문자열 오름차순
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); // 반대인 내림차순
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

//        System.out.println(queue.getFirst());
//        System.out.println(queue.getLast());

        /**
         * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
         * poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거
         */
        // 선입선출 : FIFO(First In First Out)
        System.out.println(queue);
        System.out.println("peek() : " + queue.peek());
        System.out.println("poll() : " + queue.poll());
        System.out.println("queue = " + queue);
    }
}

