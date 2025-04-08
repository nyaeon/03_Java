package com.ohgiraffers.section03.filterstream.dto;

public class MemberDTO implements java.io.Serializable {

    private String id;
    private String pwd;
    private String name;
    private String email;
    private int aga;
    private char gender;
    private double point;

    public MemberDTO() {
    }

    public MemberDTO(String id, String pwd, String name, String email, int aga, char gender, double point) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.aga = aga;
        this.gender = gender;
        this.point = point;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAga() {
        return aga;
    }

    public void setAga(int aga) {
        this.aga = aga;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", aga=" + aga +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }
}
