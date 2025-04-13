package com.ohgiraffers.homework.stream;

import com.ohgiraffers.homework.stream.dto.User;

import java.util.List;
import java.util.stream.Collectors;

public class CheckAge {
    public static void main(String[] args) {
        List<User>users= List.of(new User("Alice",23),
                new User("Bob",17),
                new User("Charkie",19),
                new User("David",25)
                );
      String resilt =  users.stream()
              .filter(user -> user.getAge()>20)
              .map(user -> user.getName())
              .collect(Collectors.joining(",","[","]"));
        System.out.println(resilt);
     //   users.forEach(User ->{
     //      if(User.getAge()>=20){
     //          System.out.print("20세 이상 : [" + User.getName()+"]");
     //      }
        };
}

