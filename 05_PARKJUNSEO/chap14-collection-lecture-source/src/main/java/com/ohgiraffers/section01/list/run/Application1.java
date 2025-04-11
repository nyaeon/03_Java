package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 컬렉션 프레임워크 (Collection Framework)
        * 자바에서 컬렉션 프레임워크는 여러개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스들의 집합
        *
        * 즉, 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을
        * 미리 구현해놓은 클래스이다.
        * */

        /*
        * ArrayList
        * 가장 많이 사용되는 컬렉션 리스트
        * */

        ArrayList alist = new ArrayList();  // 기본적으로 방을 10개씩 갖고 있으나, 더 넣으면 자동으로 방이 추가됨

        List list = new ArrayList();   // ArrayList는 List를 상속받음

        Collection clist = new ArrayList();

        alist.add("apple");  // 순차적으로 데이터를 넣어줌
        alist.add(123);  // autoboxing (값 => 개체)
        alist.add(3.1415926536897932);
        alist.add(new Date());

        System.out.println("alist = " + alist);

        /*
        * arrayList의 크기는 size() 메소드로 확인 가능
        * 단, size() 메소드는 배열의 크기가 아닌 요소의 개수 반환 (10개 방에 요소가 3개 있다면 3 반환)
        * */
        System.out.println("alist.size() = " + alist.size());

        for (int i = 0; i < alist.size(); i++) {            // i번째 배열 확인
            System.out.println(i + "i" + alist.get(i));
        }

        alist.add("apple");
        System.out.println("alist = " + alist);
        // alist = [apple, 123, 3.141592653689793, Tue Apr 08 16:14:33 KST 2025, apple]인 상태임
        // alist.add를 이용해서 banana를 넣으면 맨 끝에 붙음
        // 근데 아래처럼 하면 원하는 위치에 추가 가능
        alist.add(2, "banana");  // 인덱스 2번에 banana 추가
        System.out.println("alist = " + alist);
        // alist = [apple, 123, banana, 3.141592653689793, Tue Apr 08 16:17:35 KST 2025, apple]

        alist.remove(2);    // 인덱스 2번에 있는 요소 삭제, 빈 자리는 다른 값들이 밀려서 채워줌
        // alist = [apple, 123, 3.141592653689793, Tue Apr 08 16:17:35 KST 2025, apple]

        alist.set(4, Boolean.valueOf(true));
        System.out.println("alist = " + alist);
        // 특정 인덱스의 값을 바꾸겠다는 것. 값 변경
        // alist = [apple, 123, 3.141592653689793, Tue Apr 08 16:22:12 KST 2025, true]

        List<String> stringList = new ArrayList();  // 제네릭을 걸어서 문자열만 들어갈 수 있도록 함
        stringList.add("apple");
//        stringList.add(123);    // 에러
        stringList.add("banana");
        stringList.add("lemon");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("plum");

        System.out.println("stringList = " + stringList);  // stringList = [apple, banana, lemon, orange, mango, plum]

        Collections.sort(stringList);  // 이렇게 한 후 다시 출력하면 오름차순으로 정렬됨 (아예 순서를 바꿔버림)

        System.out.println("stringList = " + stringList);  // stringList = [apple, banana, lemon, mango, orange, plum]

        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(20);
        integerList.add(5);
        integerList.add(8);
        integerList.add(37);
        System.out.println("integerList = " + integerList);     // integerList = [7, 20, 5, 8, 37]
        Collections.sort(integerList);      // 오름차순 정렬 (순서를 아예 바꿔버림)
        System.out.println("integerList = " + integerList);     // integerList = [5, 7, 8, 20, 37]

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

        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();
        while(dIter.hasNext()) {
            System.out.println(dIter.next());
        }

        while(dIter.hasNext()) {        // 두번은 안됨
            System.out.println(dIter.next());
        }

        List<String> descList = new ArrayList<>();
        while(dIter.hasNext()) {
            descList.add(dIter.next());
        }

        System.out.println("descList = " + descList);



    }
}
