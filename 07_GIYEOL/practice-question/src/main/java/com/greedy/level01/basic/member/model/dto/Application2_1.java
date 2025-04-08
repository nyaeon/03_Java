package com.greedy.level01.basic.member.model.dto;

public class Application2_1 {
    public static void main(String[] args) {
       EmployeeDTO empdb = new EmployeeDTO();
       empdb.setNumber(200);
       empdb.setName("홍길동");
       empdb.setDept("영업부");
       empdb.setJob("과장");
       empdb.setAge(20);
       empdb.setGender('남');
       empdb.setSalarly(200000000);
       empdb.setBounsPoint(0.5);
       empdb.setPhone("010-1234-5678");
       empdb.setAddress("서울시 서초구 서초동");
       System.out.println(empdb.getNumber());
       System.out.println(empdb.getName());
       System.out.println(empdb.getDept());
       System.out.println(empdb.getJob());
       System.out.println(empdb.getAge());
       System.out.println(empdb.getGender());
       System.out.println(empdb.getBounsPoint());
       System.out.println(empdb.getPhone());
       System.out.println(empdb.getAddress());


    }
}
