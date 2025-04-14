package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /***
         * 컬렉션 프레임워크(collection framework)
         * 자바에서 컬랙션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
         * 표준화된 방법을 제공하는 클래스들의 집합을 의미함
         * 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을
         * 미리 구현해놓은 클래스를 말함
         */

        /***
         * ArrayList
         * 가장 많이 사용하는 컬렉션 클래스임
         * JKD1.2부터 제공
         */
        ArrayList alist = new ArrayList();

        List list = new ArrayList();

        Collection collection = new ArrayList();

        alist.add("apple"); //alist[0] = "apple" ;
        alist.add(123); //autobaxing(값 => 객체)
        alist.add(45.67);
        alist.add(new Date());

        System.out.println("alist" + alist);
        //arrayList 크기는 size() 메소드로 확인 가능
        //size() 메소드는 배열의 크기가 아닌 요소의 갯수를 반환함
        System.out.println("alist.size()" + alist.size());
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(i + "|" + alist.get(i));

        }
        alist.add("apple");
        alist.add(2,"banana"); // index 값은 내가 넣고자하는 위치값

        System.out.println("alist" + alist);

        alist.remove(2);
        System.out.println("alist" + alist);

        alist.set(4,Boolean.valueOf(true));
        System.out.println("alist" + alist);

        List<String> strings = new ArrayList();
        strings.add("apple");
        //strings.add(123); //에러발생
        strings.add("banana");
        strings.add("orange");
        strings.add("mango");
        strings.add("grade");
        System.out.println("strings" + strings);

        Collections.sort(strings); //string에 문자열 오름차순(Ascending)에 대한 정의가 되어 있음
        System.out.println("strings" + strings);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(20);
        integerList.add(5);
        integerList.add(8);
        integerList.add(14);

        System.out.println("integerList" + integerList);
        Collections.sort(integerList);
        System.out.println("integerList" + integerList);

        /*
         * Iterator란?
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         *
         * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
         *
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
         * next() : 다음 요소를 반환
         * */
        strings = new LinkedList<>(strings);
        Iterator<String> diter = ((LinkedList<String>) strings).descendingIterator();
     //   while (diter.hasNext()) {
     //       System.out.println(diter.next());
     //   }
     //   while (diter.hasNext()) {
     //       System.out.println(diter.next());
     //   }
        List<String> descList = new ArrayList<>();
        while (diter.hasNext()) {
            descList.add(diter.next());
        }
        System.out.println("dlist" + descList);
    }
}
