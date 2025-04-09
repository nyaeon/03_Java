package com.ohgiraffers.section03.filterstream.dto;

public class MemberDTO implements java.io.Serializable { // 직렬화 해주는 인터페이스

  private String id;
  private String pwd;
  private String name;
  private String email;
  int age;
  private char gender;
  private double point;

  public MemberDTO() {
  }

  public MemberDTO(String id, String pwd, String name, String email, int age, char gender, double point) {
    this.id = id;
    this.pwd = pwd;
    this.name = name;
    this.email = email;
    this.age = age;
    this.gender = gender;
    this.proint = proint;
  }

  private double proint;

  @Override
  public String toString() {
    return "MemberDTO{" +
        "id='" + id + '\'' +
        ", pwd='" + pwd + '\'' +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", gender=" + gender +
        ", proint=" + proint +
        '}';
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

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public double getProint() {
    return point;
  }

  public void setProint(double point) {
    this.point = proint;
  }
}
