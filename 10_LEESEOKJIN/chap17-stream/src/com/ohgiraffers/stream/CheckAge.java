package com.ohgiraffers.stream;

import com.ohgiraffers.stream.dto.User;

import java.util.List;

public class CheckAge {
    public static void main(String[] args) {
        // 문제: User 리스트에서 나이가 20 이상인 사람들의 이름을 리스트로 출력하세요.
        List<User> users = List.of(
                new User("Alice", 23),
                new User("Bob", 17),
                new User("Charlie", 19),
                new User("David", 25)
        );
        // 출력값
        // [Alice, David]

        var names = users.stream()
                .filter(u -> u.age() >= 20)
                .map(User::name)
                .toList();

        System.out.println(names);
    }
}
