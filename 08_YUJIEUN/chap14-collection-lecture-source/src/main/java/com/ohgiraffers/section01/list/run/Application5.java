package com.ohgiraffers.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

//        Queue<String> queue = new Queue<>();
//        Queue<String> queue = new LinkedList<>();
//        LinkedList<String> queue = new LinkedList<>(); //  LinkedList는 queue 중에서도  deque에 해당되며
                                                        // offerFirst(),offerLast() 같은 메소드로제공된다.
        //PriorityQueue를 활용하면 선입선출 + 정렬의 개념을  가져갈 수 있디.
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); // String 의  기준대로 문자열 오름차순


        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
        queue.add("fifth");

        System.out.println(queue);

        /*
        * peek(): 해당 큐의 가장 앞에  있는  요소(먼저  들어온 요소)  를 반환
        * poll() : 해당 큐의 가장 앞에 있는  요소(먼저  들어온 요소)  를 반환하고 제거
        * */



        System.out.println("peek() = " + queue.peek());
        System.out.println("poll() = " + queue.poll());
        System.out.println("queue = " + queue);
    }
}
