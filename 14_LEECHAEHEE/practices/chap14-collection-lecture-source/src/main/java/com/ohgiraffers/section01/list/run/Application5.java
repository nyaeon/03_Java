package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application5 {
    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
//        LinkedList<String> queue = new LinkedList<>(); // LinkedList는 queue 중에서도 deque에 해당하여
                                                        // offerFirst(), offerLast()와 같은 메소드도 제공됨
        // PriorityQueue를 사용하면 선입선출 + 정렬의 개념을 가져갈 수 있다.
        PriorityQueue<String> queue = new PriorityQueue<>(); // String 기준으로 오름차순
//        PriorityQueue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
        queue.offer("first"); // 추가
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");
        System.out.println("queue = " + queue);

        /*
        * peek() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소) 반환
        * poll() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소) 반환하고 제거
        * */



        System.out.println("peek() = " + queue.peek());
        System.out.println("poll() = " + queue.poll());
        System.out.println("queue = " + queue);


                
    }
}
