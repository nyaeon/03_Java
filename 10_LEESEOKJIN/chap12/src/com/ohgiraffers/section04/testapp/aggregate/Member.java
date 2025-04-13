package com.ohgiraffers.section04.testapp.aggregate;

import java.io.Serializable;

public class Member implements Serializable {
    private int id;
    private String username;
    private String password;
    private int age;
    private String[] hobbies;
    private BloodType bloodType;

    public Member() {}

    public Member(int id, String username, String password, int age, String[] hobbies, BloodType bloodType) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }
}
