package com.ohgiraffers.section03.dto;

import com.ohgiraffers.section03.constructor.User;

public class RequestClass {

    public void requestMethod(User user){
        System.out.println("test"+user);
    }
    public UserDTO requestMethod2(UserDTO user){
        System.out.println("Return");

        return user;
    }
}
