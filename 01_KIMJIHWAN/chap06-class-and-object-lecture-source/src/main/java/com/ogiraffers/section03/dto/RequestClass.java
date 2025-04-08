package com.ogiraffers.section03.dto;

public class RequestClass {

    public void requestMethod(UserDTO user) {
        System.out.println(user);
    }

    public UserDTO requestMethod2(UserDTO user) {
        System.out.println("Return");
        user.setId("helloworld");
        return user;
    }
}
