package com.ohgiraffers.section01.list;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크(Collection Framework)
         * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
         * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
         * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을
         * 미리 구현해놓은 클래스를 말한다.
         * */

        /*
         * ArrayList
         * 가장 많이 사용되는 컬렉션 클래스이다.
         * JDK 1.2부터 제공된다.
         * */

        ArrayList alist = new ArrayList();

        List list = new ArrayList();

        Collection clist = new ArrayList();

        // 배열의 값 추가
        alist.add("apple"); // alist[0] = "apple"과 비슷한 동작
        alist.add("123"); // autoboxing (값 -> 객체)
        alist.add(45.67);
        alist.add(new Date());

        System.out.println("alist = " + alist);

        // alist.size() : 배열의 크기가 아닌 요소의 갯수를 반환
        System.out.println("alist.size() = " + alist.size());

        // 요소를 반환(출력)
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(i + " | " + alist.get(i));
        }

        // 중복된 값도 혀용
        alist.add("apple");
        alist.add(2, "banana"); // index값은 내가 넣고자하는 위치값

        System.out.println("alist = " + alist);

        // 배열의 값 삭제
        alist.remove(2);
        System.out.println("alist = " + alist);

        // 배열의 값을 변경
        alist.set(4, Boolean.valueOf(true));
        System.out.println("alist = " + alist);

        // 리스트에 제네릭으로 타입 제한
        // 배열에 문자열 타입만 받음
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        // stringList.add(12); // 타입이 맞지 않아 사용 불가
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        
        System.out.println("stringList = " + stringList);
        
        Collections.sort(stringList); // String에는 문자열 오름차순에 대한 정의가 되어있다.
        System.out.println("stringList = " + stringList);

        List<Integer> intergerList = new ArrayList<>();
        intergerList.add(4);
        intergerList.add(20);
        intergerList.add(5);
        intergerList.add(8);
        intergerList.add(14);
        System.out.println("intergerList = " + intergerList);
        Collections.sort(intergerList);
        System.out.println("intergerList = " + intergerList);

        stringList = new LinkedList<>(stringList);

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

        // 내림차순 정렬
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }
//        
//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }
        
        // 내림차순으로 정렬한것을 add()로 배열에 추가하여 출력하기
        List<String> descList = new ArrayList<>();
        while(dIter.hasNext()) {
            descList.add(dIter.next());
        }
        System.out.println("descList = " + descList);
    }
}
