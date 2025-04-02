package com.greedy.level01.basic.member.model.dto;

public class Application {
    public static void main(String[] args) {
    MemberDTO member = new MemberDTO();
    System.out.println("id: " +  member.getId() + "\npwd: " +  member.getPwd()
    + "\nname: " +  member.getName() + "\nage: " +  member.getAge()
    + "\ngender: " + member.getGender() + "\nphone: " +  member.getPhone()
    + "\nemail: " +  member.getEmail());
    member.setId("user01");
    member.setPwd("pass01");
    member.setName("홍길동");
    member.setAge(20);
    member.setGender('M');
    member.setPhone("010-1234-5678");
    member.setEmail("hong123@greedy.com");
    System.out.println("변경 후 id: " +  member.getId() + "\n변경 후 pwd: " +  member.getPwd()
    + "\n변경 후 name: " +  member.getName() + "\n변경 후 age: " +  member.getAge()
    + "\n변경 후 gender: " + member.getGender() + "\n변경 후 phone: " +  member.getPhone()
    + "\n변경 후 email: " +  member.getEmail());
    }
}
