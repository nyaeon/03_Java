package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();

        //getter
        member.getId();
        System.out.println("id : " + member.getId());

        member.getPwd();
        System.out.println("pwd : " + member.getPwd());

        member.getName();
        System.out.println("name : " + member.getName());

        member.getAge();
        System.out.println("age : " + member.getAge());

        member.getGender();
        System.out.println("gender : " + member.getGender());

        member.getPhone();
        System.out.println("phone : " + member.getPhone());

        member.getEmail();
        System.out.println("email : " + member.getEmail());

        // 변경 후 값을 넣을 때는 setter

        member.setId("user01");
        System.out.println("변경 후 id : " + member.getId());

        member.setPwd("pass01");
        System.out.println("변경 후 pwd : " + member.getPwd());

        member.setName("홍길동");
        System.out.println("변경 후 name : " + member.getName());

        member.setAge(20);
        System.out.println("변경 후 age : " + member.getAge());

        member.setGender('M');
        System.out.println("변경 후 gender : " + member.getGender());

        member.setPhone("010-1234-5678");
        System.out.println("변경 후 phone : " + member.getPhone());

        member.setEmail("hong123@greedy.com");
        System.out.println("변경 후 email : " + member.getEmail());


    }


}
