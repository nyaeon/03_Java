package com.ohgiraffers.lambda.friend;

import java.util.List;
import java.util.Map;

public class friendApp {

    public static void main(String[] args) {
// 1. 다음 리스트를 순회하면서 40세 이상만 출력하세요. (list의 forEach메소드 사
//        용할 것.)
        List<Friend> list = List.of(
                new Friend("홍길동", 30),
                new Friend("신사임당", 48),
                new Friend("전봉준", 35),
                new Friend("세종대왕", 54),
                new Friend("간달프", 105)
        );

        list.forEach(friend -> {if (friend.getAge() >= 40) {
            System.out.println(friend);
        }});

// 2. 다음 map에서 key값이 홀수인 value만 출력하세요. (map의 forEach메소드 사용
//        할 것.)
        Map<Integer, Friend> map = Map.of(
                1, new Friend("홍길동", 30),
                2, new Friend("신사임당", 48),
                3, new Friend("전봉준", 35),
                4, new Friend("세종대왕", 54),
                5, new Friend("간달프", 105)
        );
        map.forEach((key, value) -> {if (key%2 == 1) {
            System.out.println(value);
        }});
    }
}



//        [수행결과]
//Person [name=신사임당, age=48]
//Person [name=세종대왕, age=54]
//Person [name=간달프, age=105]
//Person [name=홍길동, age=30]
//Person [name=전봉준, age=35]
//Person [name=간달프, age=105]