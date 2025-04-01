package com.greedy.level01.basic.member.model.dto;

public class MemberDTO {

    private String id;
    private String pwd;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String email;

    public MemberDTO() {}

    public String getId() {
        System.out.println("id : " + id);
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public String getPwd() {
        System.out.println("pwd : " + pwd);
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        System.out.println("name : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("age : " + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        System.out.println("gender : " + gender);
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        System.out.println("phone : " + phone);
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        System.out.println("email : " + email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
