package com.ohgiraffers.lamda.friend;

import java.util.List;
import java.util.Map;

public class FriendApp {

    public static void main(String[] args) {
        // 1. 다음 리스트에서 40세 이상 친구만 출력
        List<Friend> list = List.of(
                new Friend("홍길동", 30),
                new Friend("신사임당", 48),
                new Friend("전봉준", 35),
                new Friend("세종대왕", 54),
                new Friend("간달프", 105)
        );

        list.forEach((friend -> {
            if(friend.getAge() > 40)
                System.out.println(friend);
        }));
        System.out.println();

        // 2. 다음 맵에서 key값이 홀수인 value만 출력
        Map<Integer, Friend> map = Map.of(
                1, new Friend("홍길동", 30),
                2, new Friend("신사임당", 48),
                3, new Friend("전봉준", 35),
                4, new Friend("세종대왕", 54),
                5, new Friend("간달프", 105)
        );
        map.forEach((k, v) -> {
            if(k % 2 != 0)
                System.out.println(v);
        });
    }
}
