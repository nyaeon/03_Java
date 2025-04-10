package com.ohgiraffers.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        //Queue<String> queue = new Queue<>(); //단독으로 사용불가해서 매개체가 있어야함.
        //Queue<String> queue = new LinkedList<>(); // queue가 제공하는 것만 사용가능
        //LinkedList<String> queue = new LinkedList<>(); //deque(양쪽 것 확인가능해짐)로도 가능하게 됨.
        //LinkedList는 queue 중에서도 deque에 해당되어
        //offerFirst(), offerLast() 같은 메소드도 제공된다.

        //PriorityQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다.
        //PriorityQueue<String> queue = new PriorityQueue<>(); //큐는 선입선출(fifo)임.
        // String의 기준대로 문자열을 오름차순 해준 것.

        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());//얘는 반대인 내림차순을 함.

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println(queue);

        /*
         * peak() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
         * poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거
         */

        //System.out.println(queue.getFirst());
        //System.out.println(queue.getLast());

        System.out.println("peak() : " + queue.peek());
        System.out.println("poll() : " + queue.poll());
        System.out.println("queue : " + queue);
    }
}
