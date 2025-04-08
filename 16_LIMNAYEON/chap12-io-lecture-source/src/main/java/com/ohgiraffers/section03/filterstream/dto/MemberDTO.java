package com.ohgiraffers.section03.filterstream.dto;

public class MemberDTO implements java.io.Serializable{

    private String io;
    private String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;
    private double point;

    public MemberDTO() {
    }

    public MemberDTO(String io, String pwd, String name, String email, int age, char gender, double point) {
        this.io = io;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }
}
