package com.ohgiraffers.lamba.friend;

import com.ssg.lamba.friend.Friend;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class FriendApp {

    public static void main(String[] args) {


        List<Friend> list = List.of(
                new Friend("홍길동", 30),
                new Friend("신사임당", 48),
                new Friend("전봉준", 35),
                new Friend("세종대왕", 54),
                new Friend("간달프", 105)
        );

        Function<Friend, String> transformToPersonString = friend ->
                friend.toString().replace("Friend", "Person").replace("'", "");


//        Consumer<Friend> printElements = friend -> {
//                if(friend.getAge() >= 40){
//                    System.out.println(friend);
//                }
//        };

        Consumer<Friend> printAsPerson = friend ->
                System.out.println(transformToPersonString.apply(friend));

//        list.forEach(printElements);

        list.stream()
                .filter(friend -> friend.getAge() >= 40)
                .forEach(printAsPerson);

        System.out.println("=============================");


        Map<Integer, Friend> map = Map.of(
                1, new Friend("홍길동", 30),
                2, new Friend("신사임당", 48),
                3, new Friend("전봉준", 35),
                4, new Friend("세종대왕", 54),
                5, new Friend("간달프", 105)
        );

        map.forEach((key, value) -> {
            if(key % 2 != 0) {
//                System.out.println(value);
                System.out.println(transformToPersonString.apply(value));
            }
        });







    }
}
