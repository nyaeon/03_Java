package com.ohgiraffers.stream;

import com.ohgiraffers.dto.User;

import java.util.List;
import java.util.stream.Collectors;

public class CheckAge {

    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Alice", 23),
                new User("Bob", 17),
                new User("Charlie", 19),
                new User("David", 25)
        );

        List<String> adultNames = users.stream()
                .filter(user -> user.getAge() >= 20)
                .map(User::getName)
                .collect(Collectors.toList());

        System.out.println(adultNames);
    }
}
