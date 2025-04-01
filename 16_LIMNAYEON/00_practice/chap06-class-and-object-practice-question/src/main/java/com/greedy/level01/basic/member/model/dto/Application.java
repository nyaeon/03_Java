package com.greedy.level01.basic.member.model.dto;

public class Application {
    public static void main(String[] args) {

        MemberDTO dto = new MemberDTO();
        System.out.println("id : " + dto.getId()
                + "\npwd : " + dto.getPwd()
                + "\nname : " + dto.getName()
                + "\nage : " + dto.getAge()
                + "\ngender : " + dto.getGender()
                + "\nphone : " + dto.getPhone()
                + "\nemail : " + dto.getEmail());

        dto.setId("user01");
        dto.setPwd( "pass01");
        dto.setName("홍길동");
        dto.setAge(20);
        dto.setGender('M');
        dto.setPhone("010-1234-5678");
        dto.setEmail("hong123@greedy.com");


        System.out.println("변경 후 id : " + dto.getId());
        System.out.println("변경 후 pwd : " + dto.getPwd());
        System.out.println("변경 후 name : " + dto.getName());
        System.out.println("변경 후 age : " + dto.getAge());
        System.out.println("변경 후 gender : " + dto.getGender());
        System.out.println("변경 후 phone : " + dto.getPhone());
        System.out.println("변경 후 email : " + dto.getEmail());

    }
}
