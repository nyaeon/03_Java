package com.ohgiraffers.lamda.friend;

import java.util.List;
import java.util.Map;

public class FriendApp {
    public static void main(String[] args) {
// 1. 다음 리스트를 순회하면서 40세 이상만 출력하세요. (list의 forEach메소드 사용할 것.)
        List<Friend> list = List.of(
                new Friend("홍길동", 30),
                new Friend("신사임당", 48),
                new Friend("전봉준", 35),
                new Friend("세종대왕", 54),
                new Friend("간달프", 105)
        );

        list.forEach(friend -> {
            if (friend.getAge() > 40) {
                System.out.println("40세 이상 이신 분들은 : " + friend.getName() +" 님 이시고 나이는 " + friend.getAge());
            }
        }
    );
// 2. 다음 map에서 key값이 홀수인 value만 출력하세요. (map의 forEach메소드 사용할 것.)
        Map<Integer, Friend> map = Map.of(
                1, new Friend("홍길동", 30),
                2, new Friend("신사임당", 48),
                3, new Friend("전봉준", 35),
                4, new Friend("세종대왕", 54),
                5, new Friend("간달프", 105)

        );
        map.forEach((key, value) -> {
            if (key % 2 != 0){
                System.out.println("key값이 홀수 인 분들은" + value.getName() + " 님이시고 key값은 " + key);
            }
        }
        );

    }
}

