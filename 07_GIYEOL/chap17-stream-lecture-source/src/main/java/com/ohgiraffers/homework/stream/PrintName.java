package com.ohgiraffers.homework.stream;

import com.ohgiraffers.homework.lamda2.Friend;

import java.util.List;

public class PrintName {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Franklin");
        names.forEach(name ->{
            if(name.length()>=5) {
                System.out.println(name.toUpperCase());
            }
            });

    }
}
