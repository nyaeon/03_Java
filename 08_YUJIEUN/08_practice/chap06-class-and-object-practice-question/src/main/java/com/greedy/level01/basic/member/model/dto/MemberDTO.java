package com.greedy.level01.basic.member.model.dto;

public class MemberDTO {
    private String id;
    private String pwd;
    private String name;
    private String phone;
    private String email;
    private int age;
    private char gender;

    public MemberDTO() {
    }

    public String getId() {
        System.out.println("id:" + id);
        return id;
    }

    public String getPwd() {
        System.out.println("pwd:" + pwd);
        return pwd;
    }

    public String getName() {
        System.out.println("name:" + name);
        return name;
    }

    public String getPhone() {
        System.out.println("phone:" + phone);
        return phone;
    }

    public String getEmail() {
        System.out.println("email:" + email);
        return email;
    }

    public int getAge() {
        System.out.println("age:" + age);
        return age;
    }

    public char getGender() {
        System.out.println("gender:" + gender);
        return gender;
    }

    public void setId(String id) {
        System.out.println("변경 후 id : " + id);
        this.id = id;
    }

    public void setPwd(String pwd) {
        System.out.println("번경 후 pwd : " + pwd);
        this.pwd = pwd;
    }

    public void setName(String name) {
        System.out.println("변경 후 name : " + name);
        this.name = name;
    }

    public void setPhone(String phone) {
        System.out.println("변경 후 phone : " + phone);
        this.phone = phone;
    }

    public void setEmail(String email) {
        System.out.println("변경 후 email : " + email);
        this.email = email;
    }

    public void setAge(int age) {
        System.out.println("변경 후 age : " + age);
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

