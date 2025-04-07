package com.greedy.level01.basic.member.model.dto;

public class MemberDTO {

    /**
     * # : protected
     * ~ : default
     * - : private
     * + : public
     */

    // 멤버 변수이면서 지역 변수
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    // 기본생성자
    public MemberDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
