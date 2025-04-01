package com.greedy.level01.basic.member.model.dto;

public class Application {
    public static void main(String[] args) {

        //getter를 이용해서 필드의 초기값 확인
        //setter를 이용해서 필드 값 변경
        //getter를 이용해서 변경된 필드값 확인

        MemberDTO memberDTO = new MemberDTO();


        memberDTO.getId();
        memberDTO.getPwd();
        memberDTO.getName();
        memberDTO.getAge();
        memberDTO.getGender();
        memberDTO.getPhone();
        memberDTO.getEmail();


        memberDTO.setId("오동동");
        memberDTO.setPwd("ek2324");
        memberDTO.setAge(18);
        memberDTO.setGender('남');
        memberDTO.setPhone("1888888888");
        memberDTO.setEmail("1888888888@qq.com");

    }




}
