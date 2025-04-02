package com.greedy.level01.basic.member.model.dto;

public class Application1 {
    public static void main(String[] args) {
        // 기본생성자를 이용해서 객체를 생성
        MemberDTO dto = new MemberDTO();

        System.out.println("id : " + dto.getId());
        System.out.println("pwd : " + dto.getPwd());
        System.out.println("name : " + dto.getName());
        System.out.println("age : " + dto.getAge());
        System.out.println("gender : " + dto.getGender());
        System.out.println("phone : " + dto.getPhone());
        System.out.println("email : " + dto.getEmail());

        MemberDTO dto2 = new MemberDTO();
        dto2.setId("user01");
        dto2.setPwd("pass01");
        dto2.setName("홍길동");
        dto2.setAge(20);
        dto2.setGender('M');
        dto2.setPhone("010-1234-5678");
        dto2.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id : " + dto2.getId());
        System.out.println("변경 후 pwd : " + dto2.getPwd());
        System.out.println("변경 후 name : " + dto2.getName());
        System.out.println("변경 후 age : " + dto2.getAge());
        System.out.println("변경 후 gender : " + dto2.getGender());
        System.out.println("변경 후 phone : " + dto2.getPhone());
        System.out.println("변경 후 email : " + dto2.getEmail());
    }
}
