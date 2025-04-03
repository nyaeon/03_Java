package com.greedy.level01.basic.member.model.dto;

import javax.swing.plaf.metal.MetalComboBoxEditor;

public class Application {
    public static void main(String[] args) {

        // 기본생성자를 이용해서 객체를 생성
        MemberDTO m = new MemberDTO();

        // getter
        System.out.println("id : " + m.getId());
        System.out.println("pwd : " + m.getPwd());
        System.out.println("name : " + m.getName());
        System.out.println("age : " + m.getAge());
        System.out.println("gender : " + m.getGender());
        System.out.println("phone : " + m.getPhone());
        System.out.println("email : " + m.getEmail());

        // setter
        m.setId("user01");
        m.setPwd("pass01");
        m.setName("홍길동");
        m.setAge(20);
        m.setGender('M');
        m.setPhone("010-1234-5678");
        m.setEmail("hong123@greedy.com");

        /*
        변경 후 id : user01
        변경 후 pwd : pass01
        변경 후 name : 홍길동
        변경 후 age : 20
        변경 후 gender : M
        변경 후 phone : 010-1234-5678
        변경 후 email : hong123@greedy.com
         */
        System.out.println("변경후 id : " + m.getId());
        System.out.println("변경후 pwd : " + m.getPwd());
        System.out.println("변경후 name : " + m.getName());
        System.out.println("변경후 age : " + m.getAge());
        System.out.println("변경후 gender : " + m.getGender());
        System.out.println("변경후 phone : " + m.getPhone());
        System.out.println("변경후 emaill : " + m.getEmail());


    }
}
