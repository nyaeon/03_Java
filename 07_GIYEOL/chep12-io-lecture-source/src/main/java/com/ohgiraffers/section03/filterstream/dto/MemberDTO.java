package com.ohgiraffers.section03.filterstream.dto;

public class MemberDTO implements java.io.Serializable {
    private String id;
    private String pwd;
    private String Name;
    private String email;
    private int Age;
    private char gender;
    private double point;

    public MemberDTO() {
    }

    public MemberDTO(String id, String pwd, String name, String email, int age, char gender, double point)
    {
        this.id = id;
        this.pwd = pwd;
        Name = name;
        this.email = email;
        this.gender = gender;
        Age = age;
        this.point = point;
    }

    @Override
    public String toString() {
        return "[" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", Age=" + Age +
                ", point=" + point +
                ']';
    }
}
