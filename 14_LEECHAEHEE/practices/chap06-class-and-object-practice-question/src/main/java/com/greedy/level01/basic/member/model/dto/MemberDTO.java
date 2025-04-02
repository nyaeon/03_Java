package com.greedy.level01.basic.member.model.dto;

public class MemberDTO {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public MemberDTO() {
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setMemberDTO(String id, String pwd, String name, int age, char gender, String phone, String email) {
        this.id =  id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }
}

